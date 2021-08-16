package com.kodluyoruz.hungryapp.ui.meal_adding

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.kodluyoruz.hungryapp.data.ApiRepository
import com.kodluyoruz.hungryapp.data.entity.RestaurantsItem
import com.kodluyoruz.hungryapp.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MealAddingViewModel @Inject constructor(val repository: ApiRepository) : ViewModel() {

    fun addMeal(id: String, restaurantsItem: RestaurantsItem): LiveData<Resource<RestaurantsItem>> {
        return repository.addMeal(id, restaurantsItem)
    }
}