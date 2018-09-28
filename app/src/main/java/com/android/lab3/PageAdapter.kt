package com.android.lab3

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import kotlinx.android.synthetic.main.activity_2.*

const val recent_news: String = "RECENT NEWS"
const val category: String = "RECENT NEWS"

class PageAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {

        val  fragment1 : Fragment = BlankFragment()
        val  fragment3 : Fragment = BlankFragment3()

        /*when (position) {
            0 -> return BlankFragment.newInstance("First Title")
            else -> return BlankFragment3.newInstance()
        }*/

        when (position) {
            0 -> return fragment1
            else -> return fragment3
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        if (position%2 ==0) return "RECENT NEWS"
        else return "CATEGORY"

    }

    override fun getCount(): Int {
        return 2
    }

}