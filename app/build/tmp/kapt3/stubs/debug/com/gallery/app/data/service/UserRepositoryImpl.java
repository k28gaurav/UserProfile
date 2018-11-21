package com.gallery.app.data.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH\u0016J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f0\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/gallery/app/data/service/UserRepositoryImpl;", "Lcom/gallery/app/domain/repository/UserRepository;", "cartDatabase", "Lcom/gallery/app/data/db/UserDatabse;", "apiService", "Lcom/gallery/app/data/service/ApiService;", "schedulersFacade", "Lcom/gallery/app/rx/SchedulersFacade;", "(Lcom/gallery/app/data/db/UserDatabse;Lcom/gallery/app/data/service/ApiService;Lcom/gallery/app/rx/SchedulersFacade;)V", "fetchItems", "Lio/reactivex/Single;", "", "Lcom/gallery/app/data/db/entities/Item;", "getItems", "Landroid/arch/lifecycle/LiveData;", "Landroid/arch/paging/PagedList;", "isValidName", "", "name", "", "saveAllItems", "", "items", "app_debug"})
public final class UserRepositoryImpl implements com.gallery.app.domain.repository.UserRepository {
    private final com.gallery.app.data.db.UserDatabse cartDatabase = null;
    private final com.gallery.app.data.service.ApiService apiService = null;
    private final com.gallery.app.rx.SchedulersFacade schedulersFacade = null;
    
    @java.lang.Override()
    public boolean isValidName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<com.gallery.app.data.db.entities.Item>> fetchItems() {
        return null;
    }
    
    @java.lang.Override()
    public void saveAllItems(@org.jetbrains.annotations.NotNull()
    java.util.List<com.gallery.app.data.db.entities.Item> items) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.arch.lifecycle.LiveData<android.arch.paging.PagedList<com.gallery.app.data.db.entities.Item>> getItems() {
        return null;
    }
    
    @javax.inject.Inject()
    public UserRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.gallery.app.data.db.UserDatabse cartDatabase, @org.jetbrains.annotations.NotNull()
    com.gallery.app.data.service.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.gallery.app.rx.SchedulersFacade schedulersFacade) {
        super();
    }
}