package com.gallery.app.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\u0006H\u0004J\b\u0010\n\u001a\u00020\u000bH\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/gallery/app/base/BaseViewModel;", "Landroid/arch/lifecycle/ViewModel;", "schedulers", "Lcom/gallery/app/rx/SchedulerProvider;", "(Lcom/gallery/app/rx/SchedulerProvider;)V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "getSchedulers", "()Lcom/gallery/app/rx/SchedulerProvider;", "getCompositeDisposable", "onCleared", "", "app_debug"})
public class BaseViewModel extends android.arch.lifecycle.ViewModel {
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    @org.jetbrains.annotations.NotNull()
    private final com.gallery.app.rx.SchedulerProvider schedulers = null;
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gallery.app.rx.SchedulerProvider getSchedulers() {
        return null;
    }
    
    public BaseViewModel(@org.jetbrains.annotations.NotNull()
    com.gallery.app.rx.SchedulerProvider schedulers) {
        super();
    }
}