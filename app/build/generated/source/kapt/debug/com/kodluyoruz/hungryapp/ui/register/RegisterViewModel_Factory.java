// Generated by Dagger (https://dagger.dev).
package com.kodluyoruz.hungryapp.ui.register;

import com.kodluyoruz.hungryapp.data.ApiRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RegisterViewModel_Factory implements Factory<RegisterViewModel> {
  private final Provider<ApiRepository> apiRepositoryProvider;

  public RegisterViewModel_Factory(Provider<ApiRepository> apiRepositoryProvider) {
    this.apiRepositoryProvider = apiRepositoryProvider;
  }

  @Override
  public RegisterViewModel get() {
    return newInstance(apiRepositoryProvider.get());
  }

  public static RegisterViewModel_Factory create(Provider<ApiRepository> apiRepositoryProvider) {
    return new RegisterViewModel_Factory(apiRepositoryProvider);
  }

  public static RegisterViewModel newInstance(ApiRepository apiRepository) {
    return new RegisterViewModel(apiRepository);
  }
}
