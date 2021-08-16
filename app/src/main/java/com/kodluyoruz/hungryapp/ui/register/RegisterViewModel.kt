package com.kodluyoruz.hungryapp.ui.register

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.kodluyoruz.hungryapp.data.ApiRepository
import com.kodluyoruz.hungryapp.data.entity.UsersItem
import com.kodluyoruz.hungryapp.data.entity.dtos.UserDto
import com.kodluyoruz.hungryapp.utils.Common
import com.kodluyoruz.hungryapp.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(private val apiRepository: ApiRepository) :
    ViewModel() {

    fun register(user: UserDto): LiveData<Resource<UsersItem>> {
        return apiRepository.register(user)
    }

    fun registerControl(email: String, password: String, name: String, surname: String): Boolean {
        return Common.isEmailValid(email) && password.length > 2 && name.length > 3 && surname.length > 3
    }
}