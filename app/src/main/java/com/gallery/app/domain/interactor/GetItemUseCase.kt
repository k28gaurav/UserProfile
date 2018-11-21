package com.gallery.app.domain.interactor

import android.arch.lifecycle.LiveData
import android.arch.paging.PagedList
import com.gallery.app.data.db.entities.Item
import com.gallery.app.domain.repository.UserRepository
import javax.inject.Inject

class GetItemsUseCase @Inject constructor(private val userRepository: UserRepository){
    fun execute(): LiveData<PagedList<Item>> {
        return userRepository.getItems()
    }
}