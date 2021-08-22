package com.kodluyoruz.hungryapp.ui.order_history

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.kodluyoruz.hungryapp.data.entity.OrderFood
import com.kodluyoruz.hungryapp.data.entity.OrdersItem
import com.kodluyoruz.hungryapp.databinding.FragmentOrderHistoryBinding
import com.kodluyoruz.hungryapp.ui.base.BaseFragment
import com.kodluyoruz.hungryapp.utils.Resource
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint

class OrderHistoryFragment : BaseFragment() {

    private lateinit var binding: FragmentOrderHistoryBinding
    private val adapter = OrderHistoryListAdapter()
    private val viewModel: OrderHistoryViewModel by viewModels()

    //private lateinit var orders: OrdersItem
    private lateinit var ordersList: ArrayList<OrdersItem>
    private lateinit var foodList: ArrayList<OrderFood>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOrderHistoryBinding.inflate(inflater, container, false)
        return binding.root

        //ordersList.add(OrdersItem("12/12/1212",1,"Cool",foodList,1,1,1))
        //adapter.setDataset(ordersList)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //binding.orderListRV.layoutManager = LinearLayoutManager(context)
        //binding.orderListRV.adapter = adapter

        val token = viewModel.getToken()
        //ordersList.add(OrdersItem("12/12/1212",1,"Cool",foodList,1,1,1))
        //adapter.setDataset(ordersList)
        /*viewModel.getOrders(user_id = token).observe(viewLifecycleOwner, {

            when (it.status) {

                Resource.Status.LOADING -> {

                }
                Resource.Status.SUCCESS -> {
                    //it.data?.get(0)?.let { it1 -> adapter.setDataset(it1) }
                    //it.data?.get(0)?.orders?.let { it1 -> adapter.setDataset(it1) }
                    //it.data?.get(0).let { it1 -> adapter.setDataset(it1) }
                    //it.data?.get(0)?.let { it1 -> adapter.setDataset(it1) }
                    //adapter.setDataset(it.data?.get(0) as ArrayList<OrdersItem>)
                    //ordersList.clear()
                    //ordersList.addAll(it.data.get(0) as ArrayList<OrdersItem>)
                    //it.data?.get(0)?.let { it1 -> adapter.setDataset(it.data) }
                    adapter.setDataset(ordersList)


                }
                Resource.Status.ERROR -> {

                }

            }

        })*/
        /*viewModel.getRestaurant().observe(viewLifecycleOwner, {


                    //it.data?.get(0)?.let { it1 -> adapter.setDataset(it1) }
                    //it.data?.get(0)?.orders?.let { it1 -> adapter.setDataset(it1) }
                    //it.data?.get(0).let { it1 -> adapter.setDataset(it1) }
                    //it.data?.get(0)?.let { it1 -> adapter.setDataset(it1) }
                    //adapter.setDataset(it.data?.get(0) as ArrayList<OrdersItem>)
                    //ordersList.clear()
                    //ordersList.addAll(it.data.get(0) as ArrayList<OrdersItem>)
                    //it.data?.get(0)?.let { it1 -> adapter.setDataset(it.data) }
            it.menu?.let { menu ->
                viewModel.setFoodList(menu)
            }

        })*/
    }
}

//private fun OrderHistoryListAdapter.setDataset(list: OrdersItem) {}

//private fun OrderHistoryListAdapter.setDataset(list: OrdersItem?) {}



