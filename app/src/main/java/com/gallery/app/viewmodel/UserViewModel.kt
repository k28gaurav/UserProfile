package com.gallery.app.viewmodel

import com.gallery.app.base.BaseViewModel
import com.gallery.app.domain.interactor.EmailValidationUseCase
import com.gallery.app.domain.interactor.FetchItemListUseCase
import com.gallery.app.domain.interactor.GetItemsUseCase
import com.gallery.app.domain.interactor.SaveItemsUseCase
import com.gallery.app.rx.SchedulersFacade
import timber.log.Timber
import javax.inject.Inject

class UserViewModel @Inject constructor(schedulersFacade: SchedulersFacade,
                                         private val emailValidationUseCase: EmailValidationUseCase) :BaseViewModel(schedulersFacade) {

    fun isNameValid(name:String):Boolean {
        return emailValidationUseCase.execute(name)
    }
}
