package com.gallery.app.data.service;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/gallery/app/data/service/UserRepositoryImpl;", "Lcom/gallery/app/domain/repository/UserRepository;", "apiService", "Lcom/gallery/app/data/service/ApiService;", "schedulersFacade", "Lcom/gallery/app/rx/SchedulersFacade;", "(Lcom/gallery/app/data/service/ApiService;Lcom/gallery/app/rx/SchedulersFacade;)V", "getItems", "Landroid/arch/lifecycle/LiveData;", "Landroid/arch/paging/PagedList;", "", "app_debug"})
public final class UserRepositoryImpl implements com.gallery.app.domain.repository.UserRepository {
    private final com.gallery.app.data.service.ApiService apiService = null;
    private final com.gallery.app.rx.SchedulersFacade schedulersFacade = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.arch.lifecycle.LiveData<android.arch.paging.PagedList<java.lang.String>> getItems() {
        return null;
    }
    
    @javax.inject.Inject()
    public UserRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.gallery.app.data.service.ApiService apiService, @org.jetbrains.annotations.NotNull()
    com.gallery.app.rx.SchedulersFacade schedulersFacade) {
        super();
    }
}