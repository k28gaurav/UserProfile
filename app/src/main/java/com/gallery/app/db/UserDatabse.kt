package com.gallery.app.data.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.gallery.app.data.db.entities.Item
import com.gallery.app.db.dao.ItemDao


@Database(entities = [Item::class], version = 1)
abstract class UserDatabse: RoomDatabase() {
    abstract fun itemDao(): ItemDao
}