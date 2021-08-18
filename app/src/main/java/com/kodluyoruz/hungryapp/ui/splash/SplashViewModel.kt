package com.kodluyoruz.hungryapp.ui.splash

import android.os.Handler
import android.os.Looper
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.kodluyoruz.hungryapp.data.ApiRepository
import com.kodluyoruz.hungryapp.data.local.SharedPrefManager
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(private val apiRepository: ApiRepository) : ViewModel() {

    private var token: Int = apiRepository.getInt(SharedPrefManager.TOKEN)
    private var firstLaunch: MutableLiveData<Boolean> = MutableLiveData()

    fun getToken(): Int = this.token
    fun isFirstLaunch(): LiveData<Boolean> = this.firstLaunch

    fun handleAppLaunch() {
        Handler(Looper.getMainLooper()).postDelayed({
            this.firstLaunch.value = apiRepository.getBoolean(SharedPrefManager.FIRST_LAUNCH)
        }, 2500)
    }

    fun saveFirstLaunch() {
        apiRepository.saveBoolean(SharedPrefManager.FIRST_LAUNCH, false)
    }

    fun navigationDone() {
        this.firstLaunch.value = null
    }

}