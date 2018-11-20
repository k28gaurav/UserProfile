package com.gallery.app.di

import com.gallery.app.module.UserModule
import com.gallery.app.ui.UserActivity
import com.gallery.app.ui.UserDetailsActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AppActivityBindingModule {
    @ActivityScoped
    @ContributesAndroidInjector(modules = [UserModule::class])
    abstract fun userActivity(): UserActivity

    @ActivityScoped
    @ContributesAndroidInjector(modules = [UserModule::class])
    abstract fun userDetailsActivity(): UserDetailsActivity
}