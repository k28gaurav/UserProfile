package com.gallery.app.domain.repository

import android.arch.lifecycle.LiveData
import android.arch.paging.PagedList

interface UserRepository {
    fun getItems(): LiveData<PagedList<String>>

}