package com.kodluyoruz.hungryapp.ui.add_address

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.kodluyoruz.hungryapp.R

public class AddAddressFragmentDirections private constructor() {
  public companion object {
    public fun actionAddAddressFragmentToProfileFragment2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_addAddressFragment_to_profileFragment2)
  }
}
