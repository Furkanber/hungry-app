package com.kodluyoruz.hungryapp.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kodluyoruz.hungryapp.data.ApiRepository
import com.kodluyoruz.hungryapp.data.entity.Menu
import com.kodluyoruz.hungryapp.data.entity.RestaurantsResponse
import com.kodluyoruz.hungryapp.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeFragmentViewModel @Inject constructor(private val repository: ApiRepository) :
    ViewModel() {

    private var foodList: MutableLiveData<ArrayList<Menu>> = MutableLiveData()

    fun getRestaurantsByDistrict(district: String): LiveData<Resource<RestaurantsResponse>> {
        if (district.equals("")) {
            return repository.getAllRestaurants()
        }
        return repository.getRestaurants(district)
    }
    fun getFoodList(): LiveData<ArrayList<Menu>> = this.foodList
}