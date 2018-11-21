package com.gallery.app.data.db;

import java.lang.System;

@android.arch.persistence.room.Database(entities = {com.gallery.app.data.db.entities.Item.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/gallery/app/data/db/UserDatabse;", "Landroid/arch/persistence/room/RoomDatabase;", "()V", "itemDao", "Lcom/gallery/app/db/dao/ItemDao;", "app_debug"})
public abstract class UserDatabse extends android.arch.persistence.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.gallery.app.db.dao.ItemDao itemDao();
    
    public UserDatabse() {
        super();
    }
}