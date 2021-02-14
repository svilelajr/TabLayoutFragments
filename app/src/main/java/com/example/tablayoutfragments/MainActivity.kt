package com.example.tablayoutfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    val viewPager by lazy { findViewById<ViewPager2>(R.id.view_pager_2) }
    val tabs by lazy { findViewById<TabLayout>(R.id.tabs) }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragments = getFragments()
        val adapter = ViewPagerAdapter(fragments, this)

        viewPager.adapter = adapter


        TabLayoutMediator(tabs, viewPager) { tab, position ->
            when (position) {
                0 -> { tab.text = "Comida"}
                1 -> { tab.text = "Bebida"}
                2 -> { tab.text = "Sobremesa"}
            }
        }.attach()

    }

    private fun getFragments(): List<Fragment> {

        return listOf(
            FoodFragment(),
            DrinksFragment(),
            DessertFragment()
        )

    }






}