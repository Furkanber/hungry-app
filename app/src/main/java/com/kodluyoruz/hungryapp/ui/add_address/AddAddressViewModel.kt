package com.kodluyoruz.hungryapp.ui.add_address

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kodluyoruz.hungryapp.data.ApiRepository
import com.kodluyoruz.hungryapp.data.entity.UsersItem
import com.kodluyoruz.hungryapp.data.entity.UsersResponse
import com.kodluyoruz.hungryapp.data.local.SharedPrefManager
import com.kodluyoruz.hungryapp.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel

class AddAddressViewModel @Inject constructor(var apiRepository: ApiRepository) : ViewModel() {

    private var token: Int = apiRepository.getInt(SharedPrefManager.TOKEN)
    private var user: MutableLiveData<UsersItem> = MutableLiveData()

    fun getUser(): LiveData<UsersItem> = this.user

    fun setUser(user: UsersItem) {
        this.user.value = user
    }

    fun getUserWithId(user_id: Int): LiveData<Resource<UsersResponse>> {
        return apiRepository.getUserWithId(user_id)
    }

    fun postAddress(id: String, user: UsersItem): LiveData<Resource<UsersItem>> {
        return apiRepository.updateUser(id, user)
    }

    fun getToken(): Int = this.token

}