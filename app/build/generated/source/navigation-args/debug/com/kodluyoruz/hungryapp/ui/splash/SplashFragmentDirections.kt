package com.kodluyoruz.hungryapp.ui.splash

import android.os.Bundle
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.kodluyoruz.hungryapp.R
import kotlin.Int

public class SplashFragmentDirections private constructor() {
  private data class ActionSplashFragmentToHomeFragment(
    public val token: Int = -1
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_splashFragment_to_homeFragment

    public override fun getArguments(): Bundle {
      val result = Bundle()
      result.putInt("token", this.token)
      return result
    }
  }

  public companion object {
    public fun actionSplashFragmentToHomeFragment(token: Int = -1): NavDirections =
        ActionSplashFragmentToHomeFragment(token)

    public fun actionSplashFragmentToMainOnBoardingFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_splashFragment_to_mainOnBoardingFragment)
  }
}
