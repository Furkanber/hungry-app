package com.kodluyoruz.hungryapp.ui.home

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.kodluyoruz.hungryapp.R
import com.kodluyoruz.hungryapp.`data`.entity.RestaurantsItem
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class HomeFragmentDirections private constructor() {
  private data class ActionHomeFragmentToRestaurantDetailFragment(
    public val restaurant: RestaurantsItem
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_homeFragment_to_restaurantDetailFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(RestaurantsItem::class.java)) {
        result.putParcelable("restaurant", this.restaurant as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(RestaurantsItem::class.java)) {
        result.putSerializable("restaurant", this.restaurant as Serializable)
      } else {
        throw UnsupportedOperationException(RestaurantsItem::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  public companion object {
    public fun actionHomeFragmentToRestaurantDetailFragment(restaurant: RestaurantsItem):
        NavDirections = ActionHomeFragmentToRestaurantDetailFragment(restaurant)

    public fun actionHomeFragmentToProfileFragment2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_profileFragment2)

    public fun actionHomeFragmentToLoginFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_loginFragment)

    public fun actionHomeFragmentToAddRestaurantFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_homeFragment_to_addRestaurantFragment)
  }
}
