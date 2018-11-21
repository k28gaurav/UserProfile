package com.gallery.app.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0016\u001a\u00020\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u0018"}, d2 = {"Lcom/gallery/app/viewmodel/UserDetailsViewModel;", "Lcom/gallery/app/base/BaseViewModel;", "getItemsUseCase", "Lcom/gallery/app/domain/interactor/GetItemsUseCase;", "fetchItemListUseCase", "Lcom/gallery/app/domain/interactor/FetchItemListUseCase;", "saveItemsUseCase", "Lcom/gallery/app/domain/interactor/SaveItemsUseCase;", "schedulersFacade", "Lcom/gallery/app/rx/SchedulersFacade;", "(Lcom/gallery/app/domain/interactor/GetItemsUseCase;Lcom/gallery/app/domain/interactor/FetchItemListUseCase;Lcom/gallery/app/domain/interactor/SaveItemsUseCase;Lcom/gallery/app/rx/SchedulersFacade;)V", "itemsLiveData", "Landroid/arch/lifecycle/LiveData;", "Landroid/arch/paging/PagedList;", "Lcom/gallery/app/data/db/entities/Item;", "getItemsLiveData", "()Landroid/arch/lifecycle/LiveData;", "timeCounterInMilliseconds", "Landroid/arch/lifecycle/MutableLiveData;", "", "getTimeCounterInMilliseconds", "()Landroid/arch/lifecycle/MutableLiveData;", "fetchItemList", "", "app_debug"})
public final class UserDetailsViewModel extends com.gallery.app.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<android.arch.paging.PagedList<com.gallery.app.data.db.entities.Item>> itemsLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.MutableLiveData<java.lang.Long> timeCounterInMilliseconds = null;
    private final com.gallery.app.domain.interactor.FetchItemListUseCase fetchItemListUseCase = null;
    private final com.gallery.app.domain.interactor.SaveItemsUseCase saveItemsUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<android.arch.paging.PagedList<com.gallery.app.data.db.entities.Item>> getItemsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.MutableLiveData<java.lang.Long> getTimeCounterInMilliseconds() {
        return null;
    }
    
    public final void fetchItemList() {
    }
    
    @javax.inject.Inject()
    public UserDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.gallery.app.domain.interactor.GetItemsUseCase getItemsUseCase, @org.jetbrains.annotations.NotNull()
    com.gallery.app.domain.interactor.FetchItemListUseCase fetchItemListUseCase, @org.jetbrains.annotations.NotNull()
    com.gallery.app.domain.interactor.SaveItemsUseCase saveItemsUseCase, @org.jetbrains.annotations.NotNull()
    com.gallery.app.rx.SchedulersFacade schedulersFacade) {
        super(null);
    }
}