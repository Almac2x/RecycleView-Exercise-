package com.almac2x.recyclerviewexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.almac2x.recyclerviewexercise.databinding.ActivityNavHostBinding
import com.almac2x.recyclerviewexercise.databinding.FragmentAttentionLayoutBinding
import com.google.android.material.tabs.TabLayout


class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityNavHostBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNavHostBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        tabLayout.addTab(tabLayout.newTab().setText("Designer"))
        tabLayout.addTab(tabLayout.newTab().setText("Category"))
        tabLayout.addTab(tabLayout.newTab().setText("Attention"))





    }






}