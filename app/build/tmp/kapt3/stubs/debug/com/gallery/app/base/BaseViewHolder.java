package com.gallery.app.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0016J\u0016\u0010\u0010\u001a\u00020\u000e2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bJ\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0014R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006\u0015"}, d2 = {"Lcom/gallery/app/base/BaseViewHolder;", "T", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "adapterCallback", "Lcom/gallery/app/base/AdapterItemClick;", "getAdapterCallback", "()Lcom/gallery/app/base/AdapterItemClick;", "setAdapterCallback", "(Lcom/gallery/app/base/AdapterItemClick;)V", "onClick", "", "clickedView", "setCallbackListener", "callback", "setData", "data", "(Ljava/lang/Object;)V", "app_debug"})
public abstract class BaseViewHolder<T extends java.lang.Object> extends android.support.v7.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.Nullable()
    private com.gallery.app.base.AdapterItemClick<T> adapterCallback;
    
    @org.jetbrains.annotations.Nullable()
    public final com.gallery.app.base.AdapterItemClick<T> getAdapterCallback() {
        return null;
    }
    
    public final void setAdapterCallback(@org.jetbrains.annotations.Nullable()
    com.gallery.app.base.AdapterItemClick<T> p0) {
    }
    
    public abstract void setData(T data);
    
    public final void setCallbackListener(@org.jetbrains.annotations.Nullable()
    com.gallery.app.base.AdapterItemClick<T> callback) {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View clickedView) {
    }
    
    public BaseViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
        super(null);
    }
}