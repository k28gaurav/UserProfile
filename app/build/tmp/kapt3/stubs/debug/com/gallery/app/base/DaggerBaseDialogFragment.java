package com.gallery.app.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0011H&J\b\u0010\u0013\u001a\u00020\u0011H&J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0014J\b\u0010\u0017\u001a\u00020\u0015H\u0014J\u0012\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u0012\u0010\u001c\u001a\u00020\u00152\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0015H\u0016J\u001a\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001c\u0010#\u001a\u00020\u00152\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u001c\u0010#\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006*"}, d2 = {"Lcom/gallery/app/base/DaggerBaseDialogFragment;", "VM", "Lcom/gallery/app/base/BaseViewModel;", "Ldagger/android/support/DaggerAppCompatDialogFragment;", "()V", "isFragmentShowCalled", "", "()Z", "setFragmentShowCalled", "(Z)V", "viewModel", "getViewModel", "()Lcom/gallery/app/base/BaseViewModel;", "setViewModel", "(Lcom/gallery/app/base/BaseViewModel;)V", "Lcom/gallery/app/base/BaseViewModel;", "getBackgroundDrawableRes", "", "getHeight", "getWidth", "initAnimations", "", "initEventHandlers", "initViews", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onStart", "onViewCreated", "view", "Landroid/view/View;", "show", "manager", "Landroid/support/v4/app/FragmentManager;", "tag", "", "transaction", "Landroid/support/v4/app/FragmentTransaction;", "app_debug"})
public abstract class DaggerBaseDialogFragment<VM extends com.gallery.app.base.BaseViewModel> extends dagger.android.support.DaggerAppCompatDialogFragment {
    @org.jetbrains.annotations.NotNull()
    protected VM viewModel;
    private boolean isFragmentShowCalled;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    protected final VM getViewModel() {
        return null;
    }
    
    protected final void setViewModel(@org.jetbrains.annotations.NotNull()
    VM p0) {
    }
    
    public final boolean isFragmentShowCalled() {
        return false;
    }
    
    public final void setFragmentShowCalled(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    protected void initViews() {
    }
    
    protected void initAnimations() {
    }
    
    protected void initEventHandlers() {
    }
    
    public abstract int getHeight();
    
    public abstract int getWidth();
    
    public abstract int getBackgroundDrawableRes();
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onDismiss(@org.jetbrains.annotations.Nullable()
    android.content.DialogInterface dialog) {
    }
    
    @java.lang.Override()
    public void show(@org.jetbrains.annotations.Nullable()
    android.support.v4.app.FragmentManager manager, @org.jetbrains.annotations.Nullable()
    java.lang.String tag) {
    }
    
    @java.lang.Override()
    public int show(@org.jetbrains.annotations.Nullable()
    android.support.v4.app.FragmentTransaction transaction, @org.jetbrains.annotations.Nullable()
    java.lang.String tag) {
        return 0;
    }
    
    public DaggerBaseDialogFragment() {
        super();
    }
}