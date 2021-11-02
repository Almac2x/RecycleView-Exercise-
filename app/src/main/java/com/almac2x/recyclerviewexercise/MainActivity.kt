package com.almac2x.recyclerviewexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.almac2x.recyclerviewexercise.databinding.ActivityNavHostBinding
import com.almac2x.recyclerviewexercise.databinding.FragmentAttentionLayoutBinding
import com.google.android.material.tabs.TabLayout


class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityNavHostBinding
    lateinit var tabLayout: TabLayout
    lateinit var viewPager2: ViewPager2
    lateinit var fragmentAdapter: FragmentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNavHostBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewPager2 = binding.viewPager

        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)
        var fragmentManager = supportFragmentManager
        fragmentAdapter = FragmentAdapter(fragmentManager, lifecycle)

        viewPager2.adapter = fragmentAdapter

        tabLayout.addTab(tabLayout.newTab().setText("Designer"))
        tabLayout.addTab(tabLayout.newTab().setText("Category"))
        tabLayout.addTab(tabLayout.newTab().setText("Attention"))

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab?.let { viewPager2.currentItem = it.position }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        } )

        viewPager2.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback() {

            override fun onPageSelected(position: Int) {
                tabLayout.selectTab(tabLayout.getTabAt(position))
            }
        })



    }






}