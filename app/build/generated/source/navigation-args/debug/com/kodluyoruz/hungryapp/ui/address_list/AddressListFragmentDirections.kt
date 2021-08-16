package com.kodluyoruz.hungryapp.ui.address_list

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.kodluyoruz.hungryapp.R

public class AddressListFragmentDirections private constructor() {
  public companion object {
    public fun actionAddressListFragmentToAddAddressFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_addressListFragment_to_addAddressFragment)
  }
}
