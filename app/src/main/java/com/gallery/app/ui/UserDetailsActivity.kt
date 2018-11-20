package com.gallery.app.ui

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import com.gallery.app.base.DaggerBaseActivity
import com.gallery.app.viewmodel.UserDetailsViewModel
import gallery.app.gaurav.com.usergalley.R
import javax.inject.Inject

class UserDetailsActivity: DaggerBaseActivity<UserDetailsViewModel>() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)
        viewModel = ViewModelProviders.of(this, viewModelFactory)[UserDetailsViewModel::class.java]
        initViews()
    }

    override fun initViews() {
        super.initViews()
    }

}