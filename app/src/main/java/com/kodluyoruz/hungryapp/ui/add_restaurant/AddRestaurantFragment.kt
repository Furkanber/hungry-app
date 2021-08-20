package com.kodluyoruz.hungryapp.ui.add_restaurant

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.google.android.material.button.MaterialButton
import com.kodluyoruz.hungryapp.data.entity.Address
import com.kodluyoruz.hungryapp.data.entity.Menu
import com.kodluyoruz.hungryapp.data.entity.Owner
import com.kodluyoruz.hungryapp.data.entity.dtos.RestaurantDto
import com.kodluyoruz.hungryapp.databinding.AddRestaurantFragmentBinding
import com.kodluyoruz.hungryapp.ui.base.BaseFragment
import dagger.hilt.android.AndroidEntryPoint
import java.util.*
import kotlin.collections.ArrayList

@AndroidEntryPoint
class AddRestaurantFragment : BaseFragment() {

    private lateinit var binding: AddRestaurantFragmentBinding

    // todo: Edit Text Vars
    private lateinit var restaurantNameField: EditText
    private lateinit var restaurantPhoneNumberField: EditText
    private lateinit var restaurantCityField: EditText
    private lateinit var restaurantCountyField: EditText
    private lateinit var restaurantAddressDetailField: EditText

    // todo: Button Vars
    private lateinit var clearButton: MaterialButton
    private lateinit var saveRestaurantButton: MaterialButton

    private val addRestaurantViewModel: AddRestaurantViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = AddRestaurantFragmentBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
        clearButton.setOnClickListener {
            clearAllFields()
        }
        saveRestaurantButton.setOnClickListener {
            addRestaurantViewModel.addRestaurant(submit()).observe(viewLifecycleOwner, {
                findNavController().navigateUp()

            })

        }
    }


    fun submit(): RestaurantDto {
        val address: Address = Address(
            title = "Company Address",
            add_date = Calendar.getInstance().time.toString(),
            address = restaurantAddressDetailField.text.toString(),
            city = restaurantCityField.text.toString(),
            district = restaurantCountyField.text.toString(),
            last_update = Calendar.getInstance().time.toString()
        )
        val item: RestaurantDto = RestaurantDto(
            address = address,
            average_delivery_time = 10,
            phone_number = restaurantPhoneNumberField.text.toString(),
            point = 5,
            review = "Wonderful",
            owner = Owner(
                email = "",
                name = "",
                password = "",
                phone_number = "",
                surname = ""
            ),
            photo_url = "",
            menu = ArrayList<Menu>(),
            min_order = 20,
            name = restaurantNameField.text.toString()
        )
        return item
    }

    fun initViews() {
        restaurantNameField = binding.restaurantNameEdittext
        restaurantPhoneNumberField = binding.phoneNumberEdittext
        restaurantCityField = binding.restaurantCityEdittext
        restaurantCountyField = binding.restaurantCountyEdittext
        restaurantAddressDetailField = binding.restaurantAddressdtEdittext
        clearButton = binding.clearButton
        saveRestaurantButton = binding.saveRestaurantButton
    }

    fun clearAllFields() {
        restaurantNameField.text.clear()
        restaurantPhoneNumberField.text.clear()
        restaurantCityField.text.clear()
        restaurantCountyField.text.clear()
        restaurantAddressDetailField.text.clear()
    }

}