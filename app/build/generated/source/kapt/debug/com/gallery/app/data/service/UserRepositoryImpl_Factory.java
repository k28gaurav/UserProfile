// Generated by Dagger (https://google.github.io/dagger).
package com.gallery.app.data.service;

import com.gallery.app.rx.SchedulersFacade;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class UserRepositoryImpl_Factory implements Factory<UserRepositoryImpl> {
  private final Provider<ApiService> apiServiceProvider;

  private final Provider<SchedulersFacade> schedulersFacadeProvider;

  public UserRepositoryImpl_Factory(
      Provider<ApiService> apiServiceProvider,
      Provider<SchedulersFacade> schedulersFacadeProvider) {
    this.apiServiceProvider = apiServiceProvider;
    this.schedulersFacadeProvider = schedulersFacadeProvider;
  }

  @Override
  public UserRepositoryImpl get() {
    return provideInstance(apiServiceProvider, schedulersFacadeProvider);
  }

  public static UserRepositoryImpl provideInstance(
      Provider<ApiService> apiServiceProvider,
      Provider<SchedulersFacade> schedulersFacadeProvider) {
    return new UserRepositoryImpl(apiServiceProvider.get(), schedulersFacadeProvider.get());
  }

  public static UserRepositoryImpl_Factory create(
      Provider<ApiService> apiServiceProvider,
      Provider<SchedulersFacade> schedulersFacadeProvider) {
    return new UserRepositoryImpl_Factory(apiServiceProvider, schedulersFacadeProvider);
  }

  public static UserRepositoryImpl newUserRepositoryImpl(
      ApiService apiService, SchedulersFacade schedulersFacade) {
    return new UserRepositoryImpl(apiService, schedulersFacade);
  }
}
