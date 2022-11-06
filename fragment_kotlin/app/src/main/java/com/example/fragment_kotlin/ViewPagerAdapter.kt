package com.example.fragment_kotlin

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.fragment_kotlin.FirstFragment
import com.example.fragment_kotlin.SecondFragment
import com.example.fragment_kotlin.ThirdFragment

class ViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    override fun createFragment(position: Int): Fragment {
        return if (position == 0) {
            FirstFragment()
        } else if (position == 1) {
            SecondFragment()
        } else {
            ThirdFragment()
        }
    }

    override fun getItemCount(): Int {
        return 3
    }
}