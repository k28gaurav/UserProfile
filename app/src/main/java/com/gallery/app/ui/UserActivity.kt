package com.gallery.app.ui

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.gallery.app.base.DaggerBaseActivity
import com.gallery.app.ui.adapter.AllItemsAdapter
import com.gallery.app.viewmodel.UserViewModel
import gallery.app.gaurav.com.usergalley.R
import kotlinx.android.synthetic.main.activity_user.btn_start
import kotlinx.android.synthetic.main.activity_user.et_name
import kotlinx.android.synthetic.main.activity_user_detail.rv_gallery
import javax.inject.Inject

class UserActivity : DaggerBaseActivity<UserViewModel>() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    lateinit var allItemsAdapter: AllItemsAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_detail)
        viewModel = ViewModelProviders.of(this, viewModelFactory)[UserViewModel::class.java]
        initViews()
    }

    override fun initViews() {
        rv_gallery.layoutManager = LinearLayoutManager(this)

        allItemsAdapter = AllItemsAdapter(this) { position, item ->
            //TODO If have to perform any func on click
        }

        rv_gallery.adapter = allItemsAdapter

        btn_start.setOnClickListener {
            if(!viewModel.isNameValid(et_name.text.toString())) {
                et_name.error = getString(R.string.empty_field_message)
            }
        }
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