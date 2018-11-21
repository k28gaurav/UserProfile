package com.gallery.app.viewmodel

import android.arch.lifecycle.MutableLiveData
import com.gallery.app.base.BaseViewModel
import com.gallery.app.domain.interactor.FetchItemListUseCase
import com.gallery.app.domain.interactor.GetItemsUseCase
import com.gallery.app.domain.interactor.SaveItemsUseCase
import com.gallery.app.rx.SchedulersFacade
import timber.log.Timber
import javax.inject.Inject

class UserDetailsViewModel @Inject constructor(getItemsUseCase: GetItemsUseCase,
                                               private val fetchItemListUseCase: FetchItemListUseCase,
                                               private val saveItemsUseCase: SaveItemsUseCase, schedulersFacade: SchedulersFacade) : BaseViewModel(schedulersFacade) {

    val itemsLiveData = getItemsUseCase.execute()
    val timeCounterInMilliseconds = MutableLiveData<Long>()

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




}