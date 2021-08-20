package com.kodluyoruz.hungryapp.ui.order_history

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kodluyoruz.hungryapp.data.entity.OrdersItem
import com.kodluyoruz.hungryapp.data.entity.RestaurantsItem
import com.kodluyoruz.hungryapp.databinding.OrderHistoryItemBinding

class OrderHistoryListAdapter : RecyclerView.Adapter<OrderHistoryListAdapter.OrderViewHolder>() {

    private var orderList = ArrayList<OrdersItem>()
    private var restaurantList = ArrayList<RestaurantsItem>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderViewHolder {
        return OrderViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: OrderViewHolder, position: Int) {
        val item = orderList[position]
        val restaurantItem = restaurantList[position]
        holder.bind(item, restaurantItem)
    }

    fun setDataset(list: ArrayList<OrdersItem>) {
        this.orderList = list
        notifyDataSetChanged()
    }

    class OrderViewHolder(private val binding: OrderHistoryItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(order: OrdersItem, restaurant: RestaurantsItem) {

            binding.dateTV.text = order.date
            binding.addressDistrictTV.text = restaurant.address.city
            binding.restaurantPointTV.text = restaurant.point.toString()
            binding.restaurantNameTV.text = restaurant.name
            binding.orderNoteTV.text = order.note

        }

        companion object {
            fun from(parent: ViewGroup): OrderViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = OrderHistoryItemBinding.inflate(layoutInflater, parent, false)
                return OrderViewHolder(binding)
            }
        }

    }

    override fun getItemCount(): Int = orderList.size
}