package com.gallery.app.ui

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import com.gallery.app.base.DaggerBaseActivity
import com.gallery.app.viewmodel.UserViewModel
import gallery.app.gaurav.com.usergalley.R
import kotlinx.android.synthetic.main.activity_user.et_name
import javax.inject.Inject

class UserActivity: DaggerBaseActivity<UserViewModel>() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_detail)
        viewModel = ViewModelProviders.of(this, viewModelFactory)[UserViewModel::class.java]
        initViews()
    }

    override fun initViews() {
        super.initViews()


    }

}