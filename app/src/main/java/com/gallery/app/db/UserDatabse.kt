package com.gaurav.cartsystem.data.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.gallery.app.db.dao.ItemDao

import com.gaurav.cartsystem.data.db.entities.Item

@Database(entities = [Item::class], version = 1)
abstract class UserDatabse: RoomDatabase() {
    abstract fun itemDao(): ItemDao
}