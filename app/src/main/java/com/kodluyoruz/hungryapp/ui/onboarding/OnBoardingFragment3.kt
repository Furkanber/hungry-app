package com.kodluyoruz.hungryapp.ui.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kodluyoruz.hungryapp.R
import com.kodluyoruz.hungryapp.ui.base.BaseFragment

class OnBoardingFragment3 : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_on_boarding3, container, false)
    }
}