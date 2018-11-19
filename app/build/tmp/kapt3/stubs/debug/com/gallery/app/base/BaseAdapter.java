package com.gallery.app.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J%\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f2\u0006\u0010\r\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u000eJ\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H&R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u00a8\u0006\u0012"}, d2 = {"Lcom/gallery/app/base/BaseAdapter;", "T", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "setContext", "onBindViewHolder", "", "holder", "Lcom/gallery/app/base/BaseViewHolder;", "dataModel", "(Lcom/gallery/app/base/BaseViewHolder;Ljava/lang/Object;)V", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "app_debug"})
public abstract class BaseAdapter<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private android.content.Context context;
    
    public abstract void onBindViewHolder(@org.jetbrains.annotations.Nullable()
    com.gallery.app.base.BaseViewHolder<T> holder, T dataModel);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.gallery.app.base.BaseViewHolder<T> onCreateViewHolder(@org.jetbrains.annotations.Nullable()
    android.view.ViewGroup parent);
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    public BaseAdapter(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}