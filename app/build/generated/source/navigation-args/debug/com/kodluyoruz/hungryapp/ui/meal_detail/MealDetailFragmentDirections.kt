package com.kodluyoruz.hungryapp.ui.meal_detail

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.kodluyoruz.hungryapp.R

public class MealDetailFragmentDirections private constructor() {
  public companion object {
    public fun actionMealDetailFragmentToLoginFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mealDetailFragment_to_loginFragment)
  }
}
