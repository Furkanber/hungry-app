package com.kodluyoruz.hungryapp.ui.edit_profile

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.kodluyoruz.hungryapp.R
import com.kodluyoruz.hungryapp.`data`.entity.UsersItem
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class EditProfileFragmentDirections private constructor() {
  private data class ActionEditProfileFragment2ToChangePasswordFragment(
    public val user: UsersItem
  ) : NavDirections {
    public override fun getActionId(): Int =
        R.id.action_editProfileFragment2_to_changePasswordFragment

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
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
  }

  public companion object {
    public fun actionEditProfileFragment2ToChangePasswordFragment(user: UsersItem): NavDirections =
        ActionEditProfileFragment2ToChangePasswordFragment(user)

    public fun actionEditProfileFragment2ToProfileFragment2(): NavDirections =
        ActionOnlyNavDirections(R.id.action_editProfileFragment2_to_profileFragment2)
  }
}
