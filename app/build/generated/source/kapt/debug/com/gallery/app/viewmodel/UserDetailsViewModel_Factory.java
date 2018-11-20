// Generated by Dagger (https://google.github.io/dagger).
package com.gallery.app.viewmodel;

import com.gallery.app.rx.SchedulersFacade;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class UserDetailsViewModel_Factory implements Factory<UserDetailsViewModel> {
  private final Provider<SchedulersFacade> schedulersFacadeProvider;

  public UserDetailsViewModel_Factory(Provider<SchedulersFacade> schedulersFacadeProvider) {
    this.schedulersFacadeProvider = schedulersFacadeProvider;
  }

  @Override
  public UserDetailsViewModel get() {
    return provideInstance(schedulersFacadeProvider);
  }

  public static UserDetailsViewModel provideInstance(
      Provider<SchedulersFacade> schedulersFacadeProvider) {
    return new UserDetailsViewModel(schedulersFacadeProvider.get());
  }

  public static UserDetailsViewModel_Factory create(
      Provider<SchedulersFacade> schedulersFacadeProvider) {
    return new UserDetailsViewModel_Factory(schedulersFacadeProvider);
  }

  public static UserDetailsViewModel newUserDetailsViewModel(SchedulersFacade schedulersFacade) {
    return new UserDetailsViewModel(schedulersFacade);
  }
}