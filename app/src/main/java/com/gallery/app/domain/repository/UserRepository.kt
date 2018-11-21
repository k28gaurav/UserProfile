package com.gallery.app.domain.repository

import android.arch.lifecycle.LiveData
import android.arch.paging.PagedList
import com.gallery.app.data.db.entities.Item
import io.reactivex.Observable
import io.reactivex.Single

interface UserRepository {
    fun getItems(): LiveData<PagedList<Item>>

    fun fetchItems(): Single<List<Item>>

    fun saveAllItems(items: List<Item>)

    fun isValidName(name:String): Boolean

}