package com.gallery.app.domain.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/gallery/app/domain/interactor/FetchItemListUseCase;", "", "userRepository", "Lcom/gallery/app/domain/repository/UserRepository;", "(Lcom/gallery/app/domain/repository/UserRepository;)V", "execute", "Lio/reactivex/Single;", "", "Lcom/gallery/app/data/db/entities/Item;", "app_debug"})
public final class FetchItemListUseCase {
    private final com.gallery.app.domain.repository.UserRepository userRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.util.List<com.gallery.app.data.db.entities.Item>> execute() {
        return null;
    }
    
    @javax.inject.Inject()
    public FetchItemListUseCase(@org.jetbrains.annotations.NotNull()
    com.gallery.app.domain.repository.UserRepository userRepository) {
        super();
    }
}