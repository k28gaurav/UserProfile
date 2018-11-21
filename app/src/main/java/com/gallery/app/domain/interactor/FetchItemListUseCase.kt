package com.gallery.app.domain.interactor

import com.gallery.app.data.db.entities.Item
import com.gallery.app.domain.repository.UserRepository
import io.reactivex.Single
import javax.inject.Inject

class FetchItemListUseCase @Inject constructor(private val userRepository: UserRepository) {
    fun execute(): Single<List<Item>> {
        return userRepository.fetchItems()
    }
}