package com.gallery.app.domain.interactor

import com.gallery.app.data.db.entities.Item
import com.gallery.app.domain.repository.UserRepository
import javax.inject.Inject

class SaveItemsUseCase @Inject constructor(private val userRepository: UserRepository) {
    fun execute(items: List<Item>) {
        userRepository.saveAllItems(items)
    }
}