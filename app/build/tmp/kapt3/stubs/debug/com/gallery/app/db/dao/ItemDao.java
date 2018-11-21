package com.gallery.app.db.dao;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\'J\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\'\u00a8\u0006\f"}, d2 = {"Lcom/gallery/app/db/dao/ItemDao;", "", "getItems", "Landroid/arch/paging/DataSource$Factory;", "", "Lcom/gallery/app/data/db/entities/Item;", "getItemsCount", "Lio/reactivex/Single;", "insertItems", "", "", "items", "app_debug"})
public abstract interface ItemDao {
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM items")
    public abstract android.arch.paging.DataSource.Factory<java.lang.Integer, com.gallery.app.data.db.entities.Item> getItems();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT COUNT(*) FROM items")
    public abstract io.reactivex.Single<java.lang.Integer> getItemsCount();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract java.util.List<java.lang.Long> insertItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.gallery.app.data.db.entities.Item> items);
}