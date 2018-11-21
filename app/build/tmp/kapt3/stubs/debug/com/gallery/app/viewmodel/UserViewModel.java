package com.gallery.app.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/gallery/app/viewmodel/UserViewModel;", "Lcom/gallery/app/base/BaseViewModel;", "schedulersFacade", "Lcom/gallery/app/rx/SchedulersFacade;", "emailValidationUseCase", "Lcom/gallery/app/domain/interactor/EmailValidationUseCase;", "(Lcom/gallery/app/rx/SchedulersFacade;Lcom/gallery/app/domain/interactor/EmailValidationUseCase;)V", "isNameValid", "", "name", "", "app_debug"})
public final class UserViewModel extends com.gallery.app.base.BaseViewModel {
    private final com.gallery.app.domain.interactor.EmailValidationUseCase emailValidationUseCase = null;
    
    public final boolean isNameValid(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return false;
    }
    
    @javax.inject.Inject()
    public UserViewModel(@org.jetbrains.annotations.NotNull()
    com.gallery.app.rx.SchedulersFacade schedulersFacade, @org.jetbrains.annotations.NotNull()
    com.gallery.app.domain.interactor.EmailValidationUseCase emailValidationUseCase) {
        super(null);
    }
}