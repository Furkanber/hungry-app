package com.kodluyoruz.hungryapp.ui.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.kodluyoruz.hungryapp.databinding.FragmentOnBoarding3Binding
import com.kodluyoruz.hungryapp.ui.base.BaseFragment

class OnBoardingFragment3 : BaseFragment() {

    private lateinit var binding: FragmentOnBoarding3Binding
    private lateinit var buttonStart: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnBoarding3Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonStart = binding.buttonStart
        buttonStart.setOnClickListener{
            findNavController().navigate(MainOnBoardingFragmentDirections.actionMainOnBoardingFragmentToHomeFragment())
        }
    }
}