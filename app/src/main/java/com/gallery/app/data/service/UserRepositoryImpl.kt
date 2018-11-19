package com.gallery.app.data.service

import android.arch.lifecycle.LiveData
import android.arch.paging.PagedList
import com.gallery.app.domain.repository.UserRepository
import com.gallery.app.rx.SchedulersFacade
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(private val apiService: ApiService,
                                             private val schedulersFacade: SchedulersFacade) : UserRepository {

    override fun getItems(): LiveData<PagedList<String>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}