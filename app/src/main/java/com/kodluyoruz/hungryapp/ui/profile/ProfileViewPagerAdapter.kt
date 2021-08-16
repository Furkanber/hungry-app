package com.kodluyoruz.hungryapp.ui.profile

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.kodluyoruz.hungryapp.ui.address_list.AddressListFragment
import com.kodluyoruz.hungryapp.ui.order_history.OrderHistoryFragment

private const val FRAGMENT_COUNT = 2

class ProfileViewPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = FRAGMENT_COUNT

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> AddressListFragment()
            1 -> OrderHistoryFragment()
            else -> AddressListFragment()
        }
    }
}