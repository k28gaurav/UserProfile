package com.gallery.app.di

import android.app.Application
import com.gallery.app.UserGalleryApplication
import com.gallery.app.common.ViewModelModule
import com.gallery.app.data.di.DataModule

import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class,
                      AndroidSupportInjectionModule::class,
                      ViewModelModule::class,
                      AndroidInjectionModule::class,
                      AppActivityBindingModule::class, DataModule::class])
interface AppComponent: AndroidInjector<UserGalleryApplication>{
    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): AppComponent.Builder

        fun build(): AppComponent
    }
}