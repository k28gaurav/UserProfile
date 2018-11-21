package com.gallery.app.domain.interactor

import com.gallery.app.domain.repository.UserRepository
import com.gallery.app.rx.SchedulersFacade
import javax.inject.Inject

class EmailValidationUseCase @Inject constructor(private val schedulersFacade: SchedulersFacade, private val userRepository: UserRepository) {

    fun execute(name:String): Boolean {
        return userRepository.isValidName(name)
    }

}