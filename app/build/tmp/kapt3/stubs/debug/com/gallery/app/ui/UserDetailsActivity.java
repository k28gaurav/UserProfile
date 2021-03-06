package com.gallery.app.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u0018H\u0002J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\u0012\u0010\u001f\u001a\u00020\u001d2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\b\u0010\"\u001a\u00020\u001dH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006$"}, d2 = {"Lcom/gallery/app/ui/UserDetailsActivity;", "Lcom/gallery/app/base/DaggerBaseActivity;", "Lcom/gallery/app/viewmodel/UserDetailsViewModel;", "()V", "PERCENTAGE_TO_ANIMATE_AVATAR", "", "allItemsAdapter", "Lcom/gallery/app/ui/adapter/AllItemsAdapter;", "getAllItemsAdapter", "()Lcom/gallery/app/ui/adapter/AllItemsAdapter;", "setAllItemsAdapter", "(Lcom/gallery/app/ui/adapter/AllItemsAdapter;)V", "mIsAvatarShown", "", "mMaxScrollSize", "timerDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "viewModelFactory", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroid/arch/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroid/arch/lifecycle/ViewModelProvider$Factory;)V", "getObservable", "Lio/reactivex/Observable;", "", "getObserver", "Lio/reactivex/observers/DisposableObserver;", "initViews", "", "observeViewModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setTimer", "Companion", "app_debug"})
public final class UserDetailsActivity extends com.gallery.app.base.DaggerBaseActivity<com.gallery.app.viewmodel.UserDetailsViewModel> {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public android.arch.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    public com.gallery.app.ui.adapter.AllItemsAdapter allItemsAdapter;
    private final int PERCENTAGE_TO_ANIMATE_AVATAR = 20;
    private boolean mIsAvatarShown;
    private int mMaxScrollSize;
    private io.reactivex.disposables.CompositeDisposable timerDisposable;
    public static final com.gallery.app.ui.UserDetailsActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    android.arch.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.gallery.app.ui.adapter.AllItemsAdapter getAllItemsAdapter() {
        return null;
    }
    
    public final void setAllItemsAdapter(@org.jetbrains.annotations.NotNull()
    com.gallery.app.ui.adapter.AllItemsAdapter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void initViews() {
    }
    
    @java.lang.Override()
    public void observeViewModel() {
    }
    
    private final void setTimer() {
    }
    
    private final io.reactivex.Observable<? extends java.lang.Long> getObservable() {
        return null;
    }
    
    private final io.reactivex.observers.DisposableObserver<java.lang.Long> getObserver() {
        return null;
    }
    
    public UserDetailsActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t\u00a8\u0006\n"}, d2 = {"Lcom/gallery/app/ui/UserDetailsActivity$Companion;", "", "()V", "startActivity", "", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "userName", "", "app_debug"})
    public static final class Companion {
        
        public final void startActivity(@org.jetbrains.annotations.NotNull()
        java.lang.ref.WeakReference<android.app.Activity> activity, @org.jetbrains.annotations.NotNull()
        java.lang.String userName) {
        }
        
        private Companion() {
            super();
        }
    }
}