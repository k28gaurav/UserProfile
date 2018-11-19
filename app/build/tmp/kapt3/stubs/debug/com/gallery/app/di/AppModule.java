package com.gallery.app.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/gallery/app/di/AppModule;", "", "()V", "bindContext", "Landroid/content/Context;", "appliction", "Landroid/app/Application;", "providerScheduler", "Lcom/gallery/app/rx/SchedulerProvider;", "schedulersFacade", "Lcom/gallery/app/rx/SchedulersFacade;", "app_debug"})
@dagger.Module()
public abstract class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract android.content.Context bindContext(@org.jetbrains.annotations.NotNull()
    android.app.Application appliction);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.gallery.app.rx.SchedulerProvider providerScheduler(@org.jetbrains.annotations.NotNull()
    com.gallery.app.rx.SchedulersFacade schedulersFacade);
    
    public AppModule() {
        super();
    }
}