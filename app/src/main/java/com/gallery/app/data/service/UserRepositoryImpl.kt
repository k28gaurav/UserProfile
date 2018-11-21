package com.gallery.app.data.service

import android.arch.lifecycle.LiveData
import android.arch.paging.LivePagedListBuilder
import android.arch.paging.PagedList
import com.gallery.app.data.db.entities.Item
import com.gallery.app.domain.repository.UserRepository
import com.gallery.app.rx.SchedulersFacade
import com.gaurav.cartsystem.data.db.UserDatabse
import io.reactivex.Observable
import io.reactivex.Single
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(private val cartDatabase: UserDatabse, private val apiService: ApiService,
                                             private val schedulersFacade: SchedulersFacade) : UserRepository {
    override fun isValidName(name: String): Boolean {
       return name.isNullOrBlank()
    }

    override fun fetchItems(): Single<List<Item>> {
        return apiService.getAllItems()
    }

    override fun saveAllItems(items: List<Item>) {
        cartDatabase.itemDao().insertItems(items)
    }

    override fun getItems(): LiveData<PagedList<Item>> {
        return LivePagedListBuilder(cartDatabase.itemDao().getItems(), 20).build()
    }

}