// Generated by Dagger (https://dagger.dev).
package com.kodluyoruz.hungryapp.ui.add_address;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AddAddressViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static AddAddressViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(AddAddressViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final AddAddressViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new AddAddressViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
