package com.kodluyoruz.hungryapp.ui.change_password

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.kodluyoruz.hungryapp.R

public class ChangePasswordFragmentDirections private constructor() {
  public companion object {
    public fun actionChangePasswordFragmentToEditProfileFragment2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_changePasswordFragment_to_editProfileFragment2)
  }
}
