package com.gallery.app.di

import android.app.Application
import android.content.Context
import com.gallery.app.rx.SchedulerProvider
import com.gallery.app.rx.SchedulersFacade

import dagger.Binds
import dagger.Module

@Module
abstract class AppModule {

    @Binds
    abstract fun bindContext(appliction: Application): Context

    @Binds
    abstract fun providerScheduler(schedulersFacade: SchedulersFacade): SchedulerProvider
}