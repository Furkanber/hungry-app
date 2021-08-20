package com.kodluyoruz.hungryapp.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.viewModels
import com.bumptech.glide.Glide
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kodluyoruz.hungryapp.data.entity.RestaurantsItem
import com.kodluyoruz.hungryapp.databinding.FragmentHomeBinding
import com.kodluyoruz.hungryapp.ui.base.BaseFragment
import com.kodluyoruz.hungryapp.utils.Resource
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment() {
    private var token: Int = -1
    private lateinit var binding: FragmentHomeBinding
    private lateinit var restaurantRecyclerView: RecyclerView
    private lateinit var restaurantRecyclerViewAdapter: RestaurantRecyclerViewAdapter
    private lateinit var dataset: ArrayList<RestaurantsItem>
    private lateinit var saveRestaurantButton: TextView
    private val homeFragmentViewModel: HomeFragmentViewModel by viewModels()
    private lateinit var resultTextView: TextView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
        fetchData()
        fetchPushRestaurantData()
    }

    private fun initViews() {
        this.resultTextView = binding.resultTextView
        this.saveRestaurantButton = binding.saveRestaurantButton
        dataset = ArrayList()
        saveRestaurantButton.setOnClickListener {
            alphaAnim(saveRestaurantButton)
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToAddRestaurantFragment())

        }
        restaurantRecyclerView = binding.restaurantRecyclerView
        restaurantRecyclerView.layoutManager = LinearLayoutManager(this.context)
        restaurantRecyclerViewAdapter = RestaurantRecyclerViewAdapter(
            restaurantList = dataset,
            context = this.requireContext(),
            onClick = object : onDetail {
                override fun click(position: Int) {
                    findNavController().navigate(
                        HomeFragmentDirections.actionHomeFragmentToRestaurantDetailFragment(
                            dataset[position]
                        )
                    )
                }
            },
        )
        restaurantRecyclerView.adapter = restaurantRecyclerViewAdapter

        binding.buttonGoToProfile.setOnClickListener {
            when (token) {
                -1 -> findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToLoginFragment())
                else -> findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToProfileFragment2())
            }
        }
    }

    private fun fetchData() {
        token = HomeFragmentArgs.fromBundle(requireArguments()).token
        if (token == -1) {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToLoginFragment())
        }
    }

    fun alphaAnim(view: View) {
        view.alpha = 0.4f
        view.animate()!!.alpha(1f).setDuration(500).start()
    }

    fun fetchPushRestaurantData() {

        homeFragmentViewModel.getRestaurantsByDistrict("").observe(viewLifecycleOwner, {
            when (it.status) {
                Resource.Status.LOADING -> {
                    resultTextView.text = "Loading Datas"
                }
                Resource.Status.SUCCESS -> {
                    resultTextView.text = it.data?.size.toString() + " Restaurants Found"
                    restaurantRecyclerViewAdapter.updateRestaurantList(it.data as ArrayList<RestaurantsItem>)
                    dataset.clear()
                    dataset.addAll(it.data as ArrayList<RestaurantsItem>)
                }
                Resource.Status.ERROR -> {
                    resultTextView.text = "Error occured."
                }
            }
        })
    }
}
