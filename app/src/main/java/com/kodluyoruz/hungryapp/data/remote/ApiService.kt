package com.kodluyoruz.hungryapp.data.remote

import com.kodluyoruz.hungryapp.data.entity.*
import com.kodluyoruz.hungryapp.data.entity.dtos.OrderDto
import com.kodluyoruz.hungryapp.data.entity.dtos.RestaurantDto
import com.kodluyoruz.hungryapp.data.entity.dtos.UserDto
import retrofit2.Response
import retrofit2.http.*

interface ApiService {

    @GET("users")
    suspend fun getUser(
        @Query("id") id: Int
    ): Response<UsersResponse>

    @GET("users")
    suspend fun login(
        @Query("email") email: String, @Query("password") password: String
    ): Response<UsersResponse>

    @POST("users")
    suspend fun register(
        @Body() user: UserDto
    ): Response<UsersItem>

    @GET("restaurants")
    suspend fun getRestaurants(
        @Query("address.district") district: String
    ): Response<RestaurantsResponse>

    @GET("orders")
    fun getOrders(
        @Query("user_id") user_id: Int
    ): Response<OrdersResponse>

    @POST("restaurants")
    suspend fun postRestaurant(
        @Body() restaurant: RestaurantDto
    ): Response<RestaurantsResponse>

    @PUT("users/{id}")
    suspend fun postAddress(@Path("id") id: String, @Body() user: UsersItem): Response<UsersItem>

    @POST("orders")
    suspend fun postOrder(@Body() order: OrderDto): Response<OrdersResponse>

    @PUT("restaurants/{id}")
    suspend fun addMeal(
        @Path("id") id: String,
        @Body restaurant: RestaurantsItem
    ): Response<RestaurantsItem>

    @PUT("users/{id}")
    suspend fun updateUser(@Path("id") id: String, @Body user: UsersItem): Response<UsersItem>

    @GET("restaurants")
    suspend fun getAllRestaurants(): Response<RestaurantsResponse>

}


