// Generated by Dagger (https://dagger.dev).
package com.kodluyoruz.hungryapp.di;

import android.content.Context;
import com.kodluyoruz.hungryapp.data.local.SharedPrefManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DatabaseModule_SharedPrefManagerFactory implements Factory<SharedPrefManager> {
  private final DatabaseModule module;

  private final Provider<Context> contextProvider;

  public DatabaseModule_SharedPrefManagerFactory(DatabaseModule module,
      Provider<Context> contextProvider) {
    this.module = module;
    this.contextProvider = contextProvider;
  }

  @Override
  public SharedPrefManager get() {
    return sharedPrefManager(module, contextProvider.get());
  }

  public static DatabaseModule_SharedPrefManagerFactory create(DatabaseModule module,
      Provider<Context> contextProvider) {
    return new DatabaseModule_SharedPrefManagerFactory(module, contextProvider);
  }

  public static SharedPrefManager sharedPrefManager(DatabaseModule instance, Context context) {
    return Preconditions.checkNotNullFromProvides(instance.sharedPrefManager(context));
  }
}
