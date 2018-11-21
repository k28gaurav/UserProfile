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
                                        getItemsUseCase: GetItemsUseCase,
                                        private val fetchItemListUseCase: FetchItemListUseCase,
                                        private val saveItemsUseCase: SaveItemsUseCase, private val emailValidationUseCase: EmailValidationUseCase) :BaseViewModel(schedulersFacade) {

    val itemsLiveData = getItemsUseCase.execute()
    val isNameValid = emailValidationUseCase.execute()

    fun fetchItemList() {
        val fetchItemListDisposal = fetchItemListUseCase.execute()
                .subscribeOn(schedulers.io())
                .map { items ->
                    items.forEach { item ->
                        item.price = (item.id * Math.random() * 89 + 10)
                    }
                    saveItemsUseCase.execute(items)
                }
                .observeOn(schedulers.ui())
                .subscribe({

                }, { err ->
                    Timber.e(err)
                    //TODO: Show error  toast and stop loading
                })

        getCompositeDisposable().add(fetchItemListDisposal)
    }

    fun isNameValid(name:String):Boolean {
        return emailValidationUseCase.execute(name)
    }
}
