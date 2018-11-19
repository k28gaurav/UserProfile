package com.gallery.app.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'\u00a8\u0006\u000b"}, d2 = {"Lcom/gallery/app/common/ViewModelModule;", "", "()V", "bindViewModelFactory", "Landroid/arch/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/gallery/app/common/ViewModelFactory;", "userViewModel", "Landroid/arch/lifecycle/ViewModel;", "viewModel", "Lcom/gallery/app/viewmodel/UserViewModel;", "app_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.gallery.app.common.ViewModelFactory factory);
    
    @org.jetbrains.annotations.NotNull()
    @ViewModelKey(value = com.gallery.app.viewmodel.UserViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract android.arch.lifecycle.ViewModel userViewModel(@org.jetbrains.annotations.NotNull()
    com.gallery.app.viewmodel.UserViewModel viewModel);
    
    public ViewModelModule() {
        super();
    }
}