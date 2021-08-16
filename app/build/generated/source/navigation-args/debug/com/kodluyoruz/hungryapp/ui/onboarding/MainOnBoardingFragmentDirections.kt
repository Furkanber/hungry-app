package com.kodluyoruz.hungryapp.ui.onboarding

import android.os.Bundle
import androidx.navigation.NavDirections
import com.kodluyoruz.hungryapp.R
import kotlin.Int

public class MainOnBoardingFragmentDirections private constructor() {
  private data class ActionMainOnBoardingFragmentToHomeFragment(
    public val token: Int = -1
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_mainOnBoardingFragment_to_homeFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putInt("token", this.token)
      return result
    }
  }

  public companion object {
    public fun actionMainOnBoardingFragmentToHomeFragment(token: Int = -1): NavDirections =
        ActionMainOnBoardingFragmentToHomeFragment(token)
  }
}
