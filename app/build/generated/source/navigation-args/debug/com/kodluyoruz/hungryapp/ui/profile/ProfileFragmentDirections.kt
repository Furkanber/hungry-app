package com.kodluyoruz.hungryapp.ui.profile

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.kodluyoruz.hungryapp.R
import kotlin.Int

public class ProfileFragmentDirections private constructor() {
  private data class ActionProfileFragment2ToHomeFragment(
    public val token: Int = -1
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_profileFragment2_to_homeFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putInt("token", this.token)
      return result
    }
  }

  public companion object {
    public fun actionProfileFragment2ToEditProfileFragment2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_profileFragment2_to_editProfileFragment2)

    public fun actionProfileFragmentToAddAddressFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_profileFragment_to_addAddressFragment)

    public fun actionProfileFragment2ToHomeFragment(token: Int = -1): NavDirections =
        ActionProfileFragment2ToHomeFragment(token)
  }
}
