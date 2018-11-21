package com.gallery.app.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\u0016\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&\u00a8\u0006\u0010"}, d2 = {"Lcom/gallery/app/domain/repository/UserRepository;", "", "fetchItems", "Lio/reactivex/Single;", "", "Lcom/gallery/app/data/db/entities/Item;", "getItems", "Landroid/arch/lifecycle/LiveData;", "Landroid/arch/paging/PagedList;", "isValidName", "", "name", "", "saveAllItems", "", "items", "app_debug"})
public abstract interface UserRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.arch.lifecycle.LiveData<android.arch.paging.PagedList<com.gallery.app.data.db.entities.Item>> getItems();
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Single<java.util.List<com.gallery.app.data.db.entities.Item>> fetchItems();
    
    public abstract void saveAllItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.gallery.app.data.db.entities.Item> items);
    
    public abstract boolean isValidName(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
}