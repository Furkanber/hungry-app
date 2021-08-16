package com.kodluyoruz.hungryapp.ui.restaurant_detail

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.kodluyoruz.hungryapp.`data`.entity.RestaurantsItem
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class RestaurantDetailFragmentArgs(
  public val restaurant: RestaurantsItem
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): RestaurantDetailFragmentArgs {
      bundle.setClassLoader(RestaurantDetailFragmentArgs::class.java.classLoader)
      val __restaurant : RestaurantsItem?
      if (bundle.containsKey("restaurant")) {
        if (Parcelable::class.java.isAssignableFrom(RestaurantsItem::class.java) ||
            Serializable::class.java.isAssignableFrom(RestaurantsItem::class.java)) {
          __restaurant = bundle.get("restaurant") as RestaurantsItem?
        } else {
          throw UnsupportedOperationException(RestaurantsItem::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__restaurant == null) {
          throw IllegalArgumentException("Argument \"restaurant\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"restaurant\" is missing and does not have an android:defaultValue")
      }
      return RestaurantDetailFragmentArgs(__restaurant)
    }
  }
}
