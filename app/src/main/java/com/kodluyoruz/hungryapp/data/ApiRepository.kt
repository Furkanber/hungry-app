package com.kodluyoruz.hungryapp.data

import com.kodluyoruz.hungryapp.data.entity.RestaurantsItem
import com.kodluyoruz.hungryapp.data.entity.UsersItem
import com.kodluyoruz.hungryapp.data.entity.dtos.OrderDto
import com.kodluyoruz.hungryapp.data.entity.dtos.RestaurantDto
import com.kodluyoruz.hungryapp.data.entity.dtos.UserDto
import com.kodluyoruz.hungryapp.data.local.LocalDataSource
import com.kodluyoruz.hungryapp.data.remote.RemoteDataSource
import com.kodluyoruz.hungryapp.utils.performNetworkOperation
import javax.inject.Inject

class ApiRepository @Inject constructor(
    private var remoteDataSource: RemoteDataSource,
    private var localDataSource: LocalDataSource
) {


    fun getUserWithId(id: Int) = performNetworkOperation {
        remoteDataSource.getUser(id)
    }

    fun login(email: String, password: String) = performNetworkOperation {
        remoteDataSource.postLogin(email, password)
    }

    fun register(user: UserDto) = performNetworkOperation {
        remoteDataSource.postRegister(user)
    }

    fun updateUser(id: String, usersItem: UsersItem) = performNetworkOperation {
        remoteDataSource.updateUser(id, usersItem)
    }

    fun getOrders(user_id: Int) = performNetworkOperation {
        remoteDataSource.getOrderList(user_id)
    }

    fun getRestaurants(district: String) = performNetworkOperation {
        remoteDataSource.getRestaurantList(district)
    }

    fun postOrder(order: OrderDto) = performNetworkOperation {
        remoteDataSource.postOrder(order)
    }

    fun postAddress(id: String, user: UsersItem) = performNetworkOperation {
        remoteDataSource.postAddress(id, user)
    }

    fun addMeal(id: String, restaurantsItem: RestaurantsItem) = performNetworkOperation {
        remoteDataSource.addMeal(id, restaurantsItem)
    }

    // todo: checkpoint
    fun postRestaurant(restaurant: RestaurantDto) = performNetworkOperation {
        remoteDataSource.postRestaurant(restaurant)
    }

    //todo: chackpoint
    fun getAllRestaurants() = performNetworkOperation {
        remoteDataSource.getAllRestaurants()
    }


    //Local
    fun saveString(key: String, data: String) {
        this.localDataSource.saveString(key, data)
    }

    fun getString(key: String): String? = this.localDataSource.getString(key)

    fun saveInt(key: String, data: Int) {
        this.localDataSource.saveInt(key, data)
    }

    fun getInt(key: String): Int = this.localDataSource.getInt(key)

    fun saveBoolean(key: String, data: Boolean) {
        this.localDataSource.saveBoolean(key, data)
    }

    fun getBoolean(key: String): Boolean = this.localDataSource.getBoolean(key)
}