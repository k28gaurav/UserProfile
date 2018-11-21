package com.gallery.app.di;

import android.app.Activity;
import com.gallery.app.module.UserDetailsModule;
import com.gallery.app.ui.UserDetailsActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = AppActivityBindingModule_UserDetailsActivity.UserDetailsActivitySubcomponent.class
)
public abstract class AppActivityBindingModule_UserDetailsActivity {
  private AppActivityBindingModule_UserDetailsActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(UserDetailsActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      UserDetailsActivitySubcomponent.Builder builder);

  @Subcomponent(modules = UserDetailsModule.class)
  @ActivityScoped
  public interface UserDetailsActivitySubcomponent extends AndroidInjector<UserDetailsActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<UserDetailsActivity> {}
  }
}
