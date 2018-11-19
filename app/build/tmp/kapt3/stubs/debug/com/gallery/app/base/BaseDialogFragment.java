package com.gallery.app.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\b\u0010\u000b\u001a\u00020\tH&J\b\u0010\f\u001a\u00020\rH\u0014J\b\u0010\u000e\u001a\u00020\rH\u0014J\b\u0010\u000f\u001a\u00020\rH\u0014J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\rH\u0016J\u001a\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001c\u0010\u001b\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u001c\u0010\u001b\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007\u00a8\u0006\""}, d2 = {"Lcom/gallery/app/base/BaseDialogFragment;", "Landroid/support/v7/app/AppCompatDialogFragment;", "()V", "isFragmentShowCalled", "", "()Z", "setFragmentShowCalled", "(Z)V", "getBackgroundDrawableRes", "", "getHeight", "getWidth", "initAnimations", "", "initEventHandlers", "initViews", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onDismiss", "dialog", "Landroid/content/DialogInterface;", "onStart", "onViewCreated", "view", "Landroid/view/View;", "show", "manager", "Landroid/support/v4/app/FragmentManager;", "tag", "", "transaction", "Landroid/support/v4/app/FragmentTransaction;", "app_debug"})
public abstract class BaseDialogFragment extends android.support.v7.app.AppCompatDialogFragment {
    private boolean isFragmentShowCalled;
    private java.util.HashMap _$_findViewCache;
    
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
    
    public BaseDialogFragment() {
        super();
    }
}