package com.gallery.app.domain.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/gallery/app/domain/interactor/SaveItemsUseCase;", "", "userRepository", "Lcom/gallery/app/domain/repository/UserRepository;", "(Lcom/gallery/app/domain/repository/UserRepository;)V", "execute", "", "items", "", "Lcom/gallery/app/data/db/entities/Item;", "app_debug"})
public final class SaveItemsUseCase {
    private final com.gallery.app.domain.repository.UserRepository userRepository = null;
    
    public final void execute(@org.jetbrains.annotations.NotNull()
    java.util.List<com.gallery.app.data.db.entities.Item> items) {
    }
    
    @javax.inject.Inject()
    public SaveItemsUseCase(@org.jetbrains.annotations.NotNull()
    com.gallery.app.domain.repository.UserRepository userRepository) {
        super();
    }
}