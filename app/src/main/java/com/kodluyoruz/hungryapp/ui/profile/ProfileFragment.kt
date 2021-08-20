package com.kodluyoruz.hungryapp.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.kodluyoruz.hungryapp.databinding.FragmentProfileBinding
import com.kodluyoruz.hungryapp.ui.base.BaseFragment
import com.kodluyoruz.hungryapp.utils.Resource
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ProfileFragment : BaseFragment() {

    private val viewModel: ProfileViewModel by viewModels()
    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
        initViewPager()
        fetchUserData()
    }

    private fun initViews() {
        //viewpager
        binding.viewPagerProfile.adapter = ProfileViewPagerAdapter(activity as AppCompatActivity)

        //tab item
        binding.buttonAddress.setOnClickListener {
            binding.viewPagerProfile.setCurrentItem(0)
        }
        binding.buttonOrderHistory.setOnClickListener {
            binding.viewPagerProfile.setCurrentItem(1)
        }

        //profile button navigation
        binding.buttonEditProfile.setOnClickListener {
            findNavController().navigate(ProfileFragmentDirections.actionProfileFragment2ToEditProfileFragment2())
        }

        //logout button
        binding.buttonLogout.setOnClickListener {
            viewModel.logout()
            findNavController().navigate(ProfileFragmentDirections.actionProfileFragment2ToHomeFragment())
        }
    }

    private fun fetchUserData() {
        val token = viewModel.getToken()
        viewModel.getUserWithId(token).observe(viewLifecycleOwner, {
            when (it.status) {

                Resource.Status.LOADING -> {

                }
                Resource.Status.SUCCESS -> {
                    binding.NameTextView.text = it.data?.get(0)?.name + " " + it.data?.get(0)?.surname
                    //binding.SurnameTextView.text = it.data?.get(0)?.surname
                    binding.EmailTextView.text = it.data?.get(0)?.email
                    Glide.with(binding.root).load(it.data?.get(0)?.photo_url).into(binding.profileImageView)
                }
                Resource.Status.ERROR -> {

                }
            }
        })
    }

    private fun initViewPager() {
        val adapter = ProfileViewPagerAdapter(requireActivity())
        binding.viewPagerProfile.adapter = adapter
    }

}
