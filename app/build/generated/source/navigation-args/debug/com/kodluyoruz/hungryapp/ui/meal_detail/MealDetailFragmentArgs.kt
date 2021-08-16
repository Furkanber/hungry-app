package com.kodluyoruz.hungryapp.ui.meal_detail

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.kodluyoruz.hungryapp.`data`.entity.Menu
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class MealDetailFragmentArgs(
  public val clickedFood: Menu,
  public val restaurantId: Int
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): MealDetailFragmentArgs {
      bundle.setClassLoader(MealDetailFragmentArgs::class.java.classLoader)
      val __clickedFood : Menu?
      if (bundle.containsKey("clickedFood")) {
        if (Parcelable::class.java.isAssignableFrom(Menu::class.java) ||
            Serializable::class.java.isAssignableFrom(Menu::class.java)) {
          __clickedFood = bundle.get("clickedFood") as Menu?
        } else {
          throw UnsupportedOperationException(Menu::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__clickedFood == null) {
          throw IllegalArgumentException("Argument \"clickedFood\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"clickedFood\" is missing and does not have an android:defaultValue")
      }
      val __restaurantId : Int
      if (bundle.containsKey("restaurantId")) {
        __restaurantId = bundle.getInt("restaurantId")
      } else {
        throw IllegalArgumentException("Required argument \"restaurantId\" is missing and does not have an android:defaultValue")
      }
      return MealDetailFragmentArgs(__clickedFood, __restaurantId)
    }
  }
}
