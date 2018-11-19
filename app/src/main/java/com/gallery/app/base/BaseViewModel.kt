package com.gallery.app.base

import android.arch.lifecycle.ViewModel
import com.gallery.app.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable

open class BaseViewModel constructor(val schedulers: SchedulerProvider): ViewModel() {

    private val disposables: CompositeDisposable = CompositeDisposable()

    protected fun getCompositeDisposable(): CompositeDisposable {
        return disposables
    }

    override fun onCleared() {
        disposables.clear()
    }

}