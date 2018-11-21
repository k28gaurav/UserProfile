package com.gallery.app.data.di

import android.arch.persistence.room.Room
import android.content.Context
import com.gallery.app.data.db.UserDatabse
import com.gallery.app.utils.Constants
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Provides
    @Singleton
    fun provideCartDatabase(context: Context): UserDatabse {
        return Room.databaseBuilder(context.applicationContext,
                UserDatabse::class.java,
                Constants.DB_NAME).build()
    }
}