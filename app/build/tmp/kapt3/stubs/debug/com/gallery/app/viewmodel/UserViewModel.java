package com.gallery.app.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000fR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/gallery/app/viewmodel/UserViewModel;", "Lcom/gallery/app/base/BaseViewModel;", "schedulersFacade", "Lcom/gallery/app/rx/SchedulersFacade;", "getItemsUseCase", "Lcom/gallery/app/domain/interactor/GetItemsUseCase;", "fetchItemListUseCase", "Lcom/gallery/app/domain/interactor/FetchItemListUseCase;", "saveItemsUseCase", "Lcom/gallery/app/domain/interactor/SaveItemsUseCase;", "emailValidationUseCase", "Lcom/gallery/app/domain/interactor/EmailValidationUseCase;", "(Lcom/gallery/app/rx/SchedulersFacade;Lcom/gallery/app/domain/interactor/GetItemsUseCase;Lcom/gallery/app/domain/interactor/FetchItemListUseCase;Lcom/gallery/app/domain/interactor/SaveItemsUseCase;Lcom/gallery/app/domain/interactor/EmailValidationUseCase;)V", "isNameValid", "", "()Z", "itemsLiveData", "Landroid/arch/lifecycle/LiveData;", "Landroid/arch/paging/PagedList;", "Lcom/gallery/app/data/db/entities/Item;", "getItemsLiveData", "()Landroid/arch/lifecycle/LiveData;", "fetchItemList", "", "name", "", "app_debug"})
public final class UserViewModel extends com.gallery.app.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final android.arch.lifecycle.LiveData<android.arch.paging.PagedList<com.gallery.app.data.db.entities.Item>> itemsLiveData = null;
    private final boolean isNameValid = false;
    private final com.gallery.app.domain.interactor.FetchItemListUseCase fetchItemListUseCase = null;
    private final com.gallery.app.domain.interactor.SaveItemsUseCase saveItemsUseCase = null;
    private final com.gallery.app.domain.interactor.EmailValidationUseCase emailValidationUseCase = null;
    
    @org.jetbrains.annotations.NotNull()
    public final android.arch.lifecycle.LiveData<android.arch.paging.PagedList<com.gallery.app.data.db.entities.Item>> getItemsLiveData() {
        return null;
    }
    
    public final boolean isNameValid() {
        return false;
    }
    
    public final void fetchItemList() {
    }
    
    public final boolean isNameValid(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return false;
    }
    
    @javax.inject.Inject()
    public UserViewModel(@org.jetbrains.annotations.NotNull()
    com.gallery.app.rx.SchedulersFacade schedulersFacade, @org.jetbrains.annotations.NotNull()
    com.gallery.app.domain.interactor.GetItemsUseCase getItemsUseCase, @org.jetbrains.annotations.NotNull()
    com.gallery.app.domain.interactor.FetchItemListUseCase fetchItemListUseCase, @org.jetbrains.annotations.NotNull()
    com.gallery.app.domain.interactor.SaveItemsUseCase saveItemsUseCase, @org.jetbrains.annotations.NotNull()
    com.gallery.app.domain.interactor.EmailValidationUseCase emailValidationUseCase) {
        super(null);
    }
}