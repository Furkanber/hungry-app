package com.kodluyoruz.hungryapp.ui.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.kodluyoruz.hungryapp.databinding.FragmentSplashBinding
import com.kodluyoruz.hungryapp.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashFragment : BaseFragment() {

    private val viewModel: SplashViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentSplashBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setObservers()
        viewModel.handleAppLaunch()
    }

    private fun setObservers() {
        viewModel.isFirstLaunch().observe(viewLifecycleOwner, {
            if (it != null) {
                when (it) {
                    true -> {
                        findNavController().navigate(SplashFragmentDirections.actionSplashFragmentToMainOnBoardingFragment())
                        viewModel.saveFirstLaunch()
                    }
                    else -> findNavController().navigate(
                        SplashFragmentDirections.actionSplashFragmentToHomeFragment(
                            viewModel.getToken()
                        )
                    )
                }
                viewModel.navigationDone()
            }
        })
    }
}