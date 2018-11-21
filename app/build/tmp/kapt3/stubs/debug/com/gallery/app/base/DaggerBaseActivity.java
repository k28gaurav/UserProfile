package com.gallery.app.base;

import java.lang.System;

/**
 * * this is base activity ,maintain the base behaviour
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\rH\u0004R\u001c\u0010\u0006\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lcom/gallery/app/base/DaggerBaseActivity;", "VM", "Lcom/gallery/app/base/BaseViewModel;", "Ldagger/android/support/DaggerAppCompatActivity;", "Landroid/view/View$OnClickListener;", "()V", "viewModel", "getViewModel", "()Lcom/gallery/app/base/BaseViewModel;", "setViewModel", "(Lcom/gallery/app/base/BaseViewModel;)V", "Lcom/gallery/app/base/BaseViewModel;", "initViews", "", "observeViewModel", "onClick", "v", "Landroid/view/View;", "setStatusBarColor", "app_debug"})
public abstract class DaggerBaseActivity<VM extends com.gallery.app.base.BaseViewModel> extends dagger.android.support.DaggerAppCompatActivity implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    protected VM viewModel;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    protected final VM getViewModel() {
        return null;
    }
    
    protected final void setViewModel(@org.jetbrains.annotations.NotNull()
    VM p0) {
    }
    
    protected final void setStatusBarColor() {
    }
    
    protected void initViews() {
    }
    
    public void observeViewModel() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    public DaggerBaseActivity() {
        super();
    }
}