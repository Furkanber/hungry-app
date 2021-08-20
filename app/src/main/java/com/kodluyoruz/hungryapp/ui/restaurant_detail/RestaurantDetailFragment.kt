package com.kodluyoruz.hungryapp.ui.restaurant_detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.kodluyoruz.hungryapp.data.entity.Menu
import com.kodluyoruz.hungryapp.data.entity.RestaurantsItem
import com.kodluyoruz.hungryapp.databinding.FragmentRestaurantDetailBinding
import com.kodluyoruz.hungryapp.ui.base.BaseFragment
import com.kodluyoruz.hungryapp.utils.IMealOnClick
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RestaurantDetailFragment : BaseFragment() {

    private lateinit var binding: FragmentRestaurantDetailBinding
    private val viewModel: RestaurantDetailViewModel by viewModels()
    private val adapter = FoodAdapter()
    private lateinit var restaurantClicked: RestaurantsItem

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentRestaurantDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViews()
        setObservers()
    }

    private fun initViews() {
        restaurantClicked = RestaurantDetailFragmentArgs.fromBundle(requireArguments()).restaurant
        viewModel.setRestaurant(restaurantClicked)

        binding.recyclerViewFoodList.layoutManager = LinearLayoutManager(context)
        binding.recyclerViewFoodList.adapter = adapter

        adapter.addListener(object : IMealOnClick {
            override fun onClick(menu: Menu) {
                viewModel.onMealClicked(menu)
            }
        })

        binding.addMeal.setOnClickListener {
            findNavController().navigate(
                RestaurantDetailFragmentDirections.actionRestaurantDetailFragmentToMealAddingFragment(
                    restaurantClicked
                )
            )
        }
    }

    private fun setObservers() {
        viewModel.getRestaurant().observe(viewLifecycleOwner, {
            binding.textViewRestaurantName.text = it.name
            val score = it.point.toString() + "/5"
            binding.textViewRestaurantScore.text = score
            val address = it.address.city + ", " + it.address.district
            binding.textViewRestaurantAddress.text = address
            val minPrice = it.min_order.toString() + " ₺"
            binding.textViewRestaurantMinDeliveryPrice.text = minPrice
            val avgDelivery = it.average_delivery_time.toString() + " min"
            binding.textViewRestaurantDeliveryTime.text = avgDelivery

            Glide.with(binding.root).load(it?.address?.address).into(binding.imageViewRestaurantLogo)

            it.menu?.let { menu ->
                viewModel.setFoodList(menu)
            }
        })

        viewModel.getFoodList().observe(viewLifecycleOwner, {
            adapter.setDataset(it)
            //Glide.with(binding.root).load(it.get(0).photo_url).into(binding.imageViewRestaurantLogo)
        })

        viewModel.getNavigateToMealDetail().observe(viewLifecycleOwner, {
            if (it != null) {
                val action =
                    RestaurantDetailFragmentDirections.actionRestaurantDetailFragmentToMealDetailFragment(
                        it,
                        restaurantClicked.id
                    )
                findNavController().navigate(action)
                viewModel.navigationToMealDetailDone()
            }
        })
    }
}