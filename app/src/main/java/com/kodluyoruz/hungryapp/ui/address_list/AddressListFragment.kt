package com.kodluyoruz.hungryapp.ui.address_list

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.kodluyoruz.hungryapp.databinding.AddressListFragmentBinding
import com.kodluyoruz.hungryapp.ui.base.BaseFragment
import com.kodluyoruz.hungryapp.ui.profile.ProfileFragmentDirections
import com.kodluyoruz.hungryapp.utils.Resource
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddressListFragment : BaseFragment() {
    private lateinit var binding: AddressListFragmentBinding
    private val adapter = AddressListAdapter()
    private val viewModel: AddressListViewModel by viewModels()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = AddressListFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.addressListRV.layoutManager = LinearLayoutManager(context)
        binding.addressListRV.adapter = adapter

        binding.buttonAddAddress.setOnClickListener {
            findNavController().navigate(ProfileFragmentDirections.actionProfileFragmentToAddAddressFragment())
        }

        val token = viewModel.getToken()
        viewModel.getUser(token).observe(viewLifecycleOwner, {

            when (it.status) {

                Resource.Status.LOADING -> {

                }
                Resource.Status.SUCCESS -> {
                    it.data?.get(0)?.address?.let { it1 -> adapter.setDataset(it1) }

                }
                Resource.Status.ERROR -> {

                }

            }

        })


    }


}