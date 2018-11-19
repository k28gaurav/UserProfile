package com.gallery.app.di

import com.gallery.app.module.GalleryModule
import com.gallery.app.ui.UserActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class AppActivityBindingModule {
    @ActivityScoped
    @ContributesAndroidInjector(modules = [GalleryModule::class])
    abstract fun userActivity(): UserActivity
}