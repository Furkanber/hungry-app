package com.kodluyoruz.hungryapp.data.remote

import com.kodluyoruz.hungryapp.data.entity.RestaurantsItem
import com.kodluyoruz.hungryapp.data.entity.UsersItem
import com.kodluyoruz.hungryapp.data.entity.dtos.OrderDto
import com.kodluyoruz.hungryapp.data.entity.dtos.RestaurantDto
import com.kodluyoruz.hungryapp.data.entity.dtos.UserDto
import com.kodluyoruz.hungryapp.utils.BaseDataSource
import javax.inject.Inject

class RemoteDataSource @Inject constructor(
    private val apiService: ApiService
) : BaseDataSource() {

    suspend fun getOrderList(id: Int) = getResult { apiService.getOrders(id) }

    suspend fun getRestaurantList(district: String) =
        getResult { apiService.getRestaurants(district) }

    suspend fun getUser(id: Int) = getResult { apiService.getUser(id) }

    suspend fun postRegister(user: UserDto) = getResult { apiService.register(user) }

    suspend fun updateUser(id: String, user: UsersItem) =
        getResult { apiService.updateUser(id, user) }

    suspend fun postLogin(email: String, password: String) =
        getResult { apiService.login(email, password) }

    suspend fun postOrder(order: OrderDto) = getResult { apiService.postOrder(order) }

    suspend fun postAddress(id: String, user: UsersItem) =
        getResult { apiService.postAddress(id, user) }

    suspend fun addMeal(id: String, restaurantsItem: RestaurantsItem) =
        getResult { apiService.addMeal(id, restaurantsItem) }

    // todo: checkpoint
    suspend fun postRestaurant(restaurant: RestaurantDto) =
        getResult { apiService.postRestaurant(restaurant) }

    suspend fun getAllRestaurants() = getResult { apiService.getAllRestaurants() }


}