package com.gallery.app.ui

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Build
import android.os.Bundle
import android.support.v4.content.ContextCompat
import com.gallery.app.R
import com.gallery.app.base.DaggerBaseActivity
import com.gallery.app.viewmodel.UserViewModel
import kotlinx.android.synthetic.main.activity_user.btn_start
import kotlinx.android.synthetic.main.activity_user.et_name

import java.lang.ref.WeakReference
import javax.inject.Inject

class UserActivity : DaggerBaseActivity<UserViewModel>() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        viewModel = ViewModelProviders.of(this, viewModelFactory)[UserViewModel::class.java]
        initViews()
    }

    override fun initViews() {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.statusBarColor = ContextCompat.getColor(this, R.color.app_intro_blue)
        }
        btn_start.setOnClickListener {
            if(!viewModel.isNameValid(et_name.text.toString())) {
                et_name.error = getString(R.string.empty_field_message)
            }else {
                UserDetailsActivity.startActivity(WeakReference(this), et_name.text.toString())
            }
        }
        super.initViews()
    }
}