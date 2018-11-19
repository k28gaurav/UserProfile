package com.gallery.app.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/gallery/app/domain/repository/UserRepository;", "", "getItems", "Landroid/arch/lifecycle/LiveData;", "Landroid/arch/paging/PagedList;", "", "app_debug"})
public abstract interface UserRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract android.arch.lifecycle.LiveData<android.arch.paging.PagedList<java.lang.String>> getItems();
}