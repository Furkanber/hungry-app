package com.kodluyoruz.hungryapp.ui.restaurant_detail

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.kodluyoruz.hungryapp.R
import com.kodluyoruz.hungryapp.`data`.entity.Menu
import com.kodluyoruz.hungryapp.`data`.entity.RestaurantsItem
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class RestaurantDetailFragmentDirections private constructor() {
  private data class ActionRestaurantDetailFragmentToMealDetailFragment(
    public val clickedFood: Menu,
    public val restaurantId: Int
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_restaurantDetailFragment_to_mealDetailFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(Menu::class.java)) {
        result.putParcelable("clickedFood", this.clickedFood as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(Menu::class.java)) {
        result.putSerializable("clickedFood", this.clickedFood as Serializable)
      } else {
        throw UnsupportedOperationException(Menu::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      result.putInt("restaurantId", this.restaurantId)
      return result
    }
  }

  private data class ActionRestaurantDetailFragmentToMealAddingFragment(
    public val restaurant: RestaurantsItem
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_restaurantDetailFragment_to_mealAddingFragment

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
    public fun actionRestaurantDetailFragmentToMealDetailFragment(clickedFood: Menu,
        restaurantId: Int): NavDirections =
        ActionRestaurantDetailFragmentToMealDetailFragment(clickedFood, restaurantId)

    public fun actionRestaurantDetailFragmentToMealAddingFragment(restaurant: RestaurantsItem):
        NavDirections = ActionRestaurantDetailFragmentToMealAddingFragment(restaurant)
  }
}
