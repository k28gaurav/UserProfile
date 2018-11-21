package com.gallery.app.ui

import android.app.Activity
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.AppBarLayout
import android.support.design.widget.AppBarLayout.OnOffsetChangedListener
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.ImageView

import com.gallery.app.R
import com.gallery.app.base.DaggerBaseActivity
import com.gallery.app.ui.adapter.AllItemsAdapter
import com.gallery.app.utils.Constants
import com.gallery.app.viewmodel.UserDetailsViewModel
import kotlinx.android.synthetic.main.activity_user_detail.appbar
import kotlinx.android.synthetic.main.activity_user_detail.profile_image
import kotlinx.android.synthetic.main.activity_user_detail.rv_gallery
import kotlinx.android.synthetic.main.activity_user_detail.toolbar
import kotlinx.android.synthetic.main.activity_user_detail.tv_user_name
import java.lang.ref.WeakReference
import javax.inject.Inject

class UserDetailsActivity : DaggerBaseActivity<UserDetailsViewModel>() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    lateinit var allItemsAdapter: AllItemsAdapter

    private val PERCENTAGE_TO_ANIMATE_AVATAR = 20
    private var mIsAvatarShown = true
    private var mMaxScrollSize: Int = 0

    companion object {
        fun startActivity(activity: WeakReference<Activity>, userName: String) {
            val intent = Intent(activity.get(), UserDetailsActivity::class.java)
            intent.putExtra(Constants.USER_NAME, userName)
            activity.get()?.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_detail)
        viewModel = ViewModelProviders.of(this, viewModelFactory)[UserDetailsViewModel::class.java]
        initViews()
        observeViewModel()
    }


    override fun initViews() {

        appbar.addOnOffsetChangedListener { appBarLayout, verticalOffset ->
            if (mMaxScrollSize == 0)
                mMaxScrollSize = appBarLayout.totalScrollRange

            val percentage = Math.abs(verticalOffset) * 100 / mMaxScrollSize

            if (percentage >= PERCENTAGE_TO_ANIMATE_AVATAR && mIsAvatarShown) {
                mIsAvatarShown = false

                profile_image.animate()
                        .scaleY(0f).scaleX(0f)
                        .setDuration(200)
                        .start()
            }

            if (percentage <= PERCENTAGE_TO_ANIMATE_AVATAR && !mIsAvatarShown) {
                mIsAvatarShown = true

                profile_image.animate()
                        .scaleY(1f).scaleX(1f)
                        .start()
            }
        }

        mMaxScrollSize = appbar.totalScrollRange

        toolbar.setNavigationOnClickListener { onBackPressed() }

        allItemsAdapter = AllItemsAdapter(this) { position, item ->
        }

        tv_user_name.text = intent.getStringExtra(Constants.USER_NAME)

        rv_gallery.layoutManager = GridLayoutManager(this, 2)
        rv_gallery.setHasFixedSize(true)
        rv_gallery.adapter = allItemsAdapter

        super.initViews()
    }

    override fun observeViewModel() {
        viewModel.itemsLiveData.observe(this, Observer { items ->
            items?.let {
                if (it.size == 0) {
                    viewModel.fetchItemList()
                }
                allItemsAdapter.submitList(items)
            }
        })
    }

}