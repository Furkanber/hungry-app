package com.kodluyoruz.hungryapp.ui.change_password

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.kodluyoruz.hungryapp.`data`.entity.UsersItem
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class ChangePasswordFragmentArgs(
  public val user: UsersItem
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(UsersItem::class.java)) {
      result.putParcelable("user", this.user as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(UsersItem::class.java)) {
      result.putSerializable("user", this.user as Serializable)
    } else {
      throw UnsupportedOperationException(UsersItem::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): ChangePasswordFragmentArgs {
      bundle.setClassLoader(ChangePasswordFragmentArgs::class.java.classLoader)
      val __user : UsersItem?
      if (bundle.containsKey("user")) {
        if (Parcelable::class.java.isAssignableFrom(UsersItem::class.java) ||
            Serializable::class.java.isAssignableFrom(UsersItem::class.java)) {
          __user = bundle.get("user") as UsersItem?
        } else {
          throw UnsupportedOperationException(UsersItem::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__user == null) {
          throw IllegalArgumentException("Argument \"user\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"user\" is missing and does not have an android:defaultValue")
      }
      return ChangePasswordFragmentArgs(__user)
    }
  }
}
