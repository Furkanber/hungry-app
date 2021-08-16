package com.kodluyoruz.hungryapp.ui.home

import android.os.Bundle
import androidx.navigation.NavArgs
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class HomeFragmentArgs(
  public val token: Int = -1
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("token", this.token)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): HomeFragmentArgs {
      bundle.setClassLoader(HomeFragmentArgs::class.java.classLoader)
      val __token : Int
      if (bundle.containsKey("token")) {
        __token = bundle.getInt("token")
      } else {
        __token = -1
      }
      return HomeFragmentArgs(__token)
    }
  }
}
