package com.kodluyoruz.hungryapp.ui.order_history

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.kodluyoruz.hungryapp.data.ApiRepository
import com.kodluyoruz.hungryapp.data.entity.OrdersResponse
import com.kodluyoruz.hungryapp.data.entity.UsersResponse
import com.kodluyoruz.hungryapp.data.local.SharedPrefManager
import com.kodluyoruz.hungryapp.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class OrderHistoryViewModel @Inject constructor(var apiRepository: ApiRepository) : ViewModel() {

    private var token: Int = apiRepository.getInt(SharedPrefManager.TOKEN)

    fun getUser(user_id: Int): LiveData<Resource<UsersResponse>> {
        return apiRepository.getUserWithId(user_id)
    }

    fun getOrders(user_id: Int): LiveData<Resource<OrdersResponse>> {
        return apiRepository.getOrders(user_id)
    }

    fun getToken(): Int = this.token
}