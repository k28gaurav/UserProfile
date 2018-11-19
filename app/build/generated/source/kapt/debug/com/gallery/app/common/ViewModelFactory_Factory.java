// Generated by Dagger (https://google.github.io/dagger).
package com.gallery.app.common;

import android.arch.lifecycle.ViewModel;
import dagger.internal.Factory;
import java.util.Map;
import javax.inject.Provider;

public final class ViewModelFactory_Factory implements Factory<ViewModelFactory> {
  private final Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> viewModelsProvider;

  public ViewModelFactory_Factory(
      Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> viewModelsProvider) {
    this.viewModelsProvider = viewModelsProvider;
  }

  @Override
  public ViewModelFactory get() {
    return provideInstance(viewModelsProvider);
  }

  public static ViewModelFactory provideInstance(
      Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> viewModelsProvider) {
    return new ViewModelFactory(viewModelsProvider.get());
  }

  public static ViewModelFactory_Factory create(
      Provider<Map<Class<? extends ViewModel>, Provider<ViewModel>>> viewModelsProvider) {
    return new ViewModelFactory_Factory(viewModelsProvider);
  }

  public static ViewModelFactory newViewModelFactory(
      Map<Class<? extends ViewModel>, Provider<ViewModel>> viewModels) {
    return new ViewModelFactory(viewModels);
  }
}
