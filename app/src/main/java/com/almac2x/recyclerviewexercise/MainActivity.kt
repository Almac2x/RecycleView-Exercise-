package com.almac2x.recyclerviewexercise

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nav_host)

        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        tabLayout.addTab(tabLayout.newTab().setText("Designer"))
        tabLayout.addTab(tabLayout.newTab().setText("Category"))
        tabLayout.addTab(tabLayout.newTab().setText("Attention"))



    }






}