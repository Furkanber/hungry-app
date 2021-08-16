package com.kodluyoruz.hungryapp.ui.add_restaurant

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.kodluyoruz.hungryapp.data.ApiRepository
import com.kodluyoruz.hungryapp.data.entity.RestaurantsResponse
import com.kodluyoruz.hungryapp.data.entity.dtos.RestaurantDto
import com.kodluyoruz.hungryapp.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AddRestaurantViewModel @Inject constructor(private val repository: ApiRepository) :
    ViewModel() {
    fun addRestaurant(restaurant: RestaurantDto): LiveData<Resource<RestaurantsResponse>> {
        return repository.postRestaurant(restaurant)
    }
}