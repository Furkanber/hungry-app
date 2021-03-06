// Generated by Dagger (https://dagger.dev).
package com.kodluyoruz.hungryapp.data.local;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LocalDataSource_Factory implements Factory<LocalDataSource> {
  private final Provider<SharedPrefManager> sharedPrefManagerProvider;

  public LocalDataSource_Factory(Provider<SharedPrefManager> sharedPrefManagerProvider) {
    this.sharedPrefManagerProvider = sharedPrefManagerProvider;
  }

  @Override
  public LocalDataSource get() {
    return newInstance(sharedPrefManagerProvider.get());
  }

  public static LocalDataSource_Factory create(
      Provider<SharedPrefManager> sharedPrefManagerProvider) {
    return new LocalDataSource_Factory(sharedPrefManagerProvider);
  }

  public static LocalDataSource newInstance(SharedPrefManager sharedPrefManager) {
    return new LocalDataSource(sharedPrefManager);
  }
}
