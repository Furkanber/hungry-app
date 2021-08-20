package com.kodluyoruz.hungryapp.ui.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.kodluyoruz.hungryapp.databinding.FragmentMainOnBoardingBinding
import com.kodluyoruz.hungryapp.ui.base.BaseFragment
import com.tbuonomo.viewpagerdotsindicator.SpringDotsIndicator
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainOnBoardingFragment : BaseFragment() {

    private lateinit var binding: FragmentMainOnBoardingBinding
    private lateinit var fragmentList: ArrayList<Fragment>
    private val layoutParamsActive = LinearLayout.LayoutParams(80, 15)
    private val layoutParamsInactive = LinearLayout.LayoutParams(55, 15)
    lateinit var springDotsIndicator: SpringDotsIndicator

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainOnBoardingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        fragmentList = arrayListOf(
            OnBoardingFragment1(),
            OnBoardingFragment2(),
            OnBoardingFragment3()
        )
        binding.viewPager.adapter =
            OnBoardingViewPagerAdapter(activity as AppCompatActivity, fragmentList)
        layoutParamsActive.marginEnd = 8
        layoutParamsInactive.marginEnd = 8

        springDotsIndicator = binding.springDotsIndicator
        springDotsIndicator.setViewPager2(binding.viewPager)
    }
}