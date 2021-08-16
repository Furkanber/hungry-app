// Generated by Dagger (https://dagger.dev).
package com.kodluyoruz.hungryapp.ui.edit_profile;

import com.kodluyoruz.hungryapp.data.ApiRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class EditProfileViewModel_Factory implements Factory<EditProfileViewModel> {
  private final Provider<ApiRepository> apiRepositoryProvider;

  public EditProfileViewModel_Factory(Provider<ApiRepository> apiRepositoryProvider) {
    this.apiRepositoryProvider = apiRepositoryProvider;
  }

  @Override
  public EditProfileViewModel get() {
    return newInstance(apiRepositoryProvider.get());
  }

  public static EditProfileViewModel_Factory create(Provider<ApiRepository> apiRepositoryProvider) {
    return new EditProfileViewModel_Factory(apiRepositoryProvider);
  }

  public static EditProfileViewModel newInstance(ApiRepository apiRepository) {
    return new EditProfileViewModel(apiRepository);
  }
}
