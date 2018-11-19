package com.gallery.app

import com.gallery.app.di.AppComponent
import com.gallery.app.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import timber.log.Timber

class UserGalleryApplication : DaggerApplication() {

    lateinit var appComponent: AppComponent
        private set

    companion object {
        lateinit var app: UserGalleryApplication
            internal set
    }

    override fun onCreate() {
        super.onCreate()
        app = this
        Timber.plant(Timber.DebugTree())
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        appComponent =  DaggerAppComponent.builder().application(this).build()
        return appComponent
    }
}