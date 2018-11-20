package com.gallery.app.di;

import android.app.Activity;
import com.gallery.app.module.UserModule;
import com.gallery.app.ui.UserActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(subcomponents = AppActivityBindingModule_UserActivity.UserActivitySubcomponent.class)
public abstract class AppActivityBindingModule_UserActivity {
  private AppActivityBindingModule_UserActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(UserActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      UserActivitySubcomponent.Builder builder);

  @Subcomponent(modules = UserModule.class)
  @ActivityScoped
  public interface UserActivitySubcomponent extends AndroidInjector<UserActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<UserActivity> {}
  }
}
