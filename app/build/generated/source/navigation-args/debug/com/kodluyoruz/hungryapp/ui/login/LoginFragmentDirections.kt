package com.kodluyoruz.hungryapp.ui.login

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.kodluyoruz.hungryapp.R

public class LoginFragmentDirections private constructor() {
  public companion object {
    public fun actionLoginFragmentToRegisterFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_loginFragment_to_registerFragment)

    public fun actionLoginFragmentToSplashFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_loginFragment_to_splashFragment)
  }
}
