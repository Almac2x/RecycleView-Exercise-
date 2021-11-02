package com.almac2x.recyclerviewexercise

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.almac2x.recyclerviewexercise.Fragments.Attention_Fragment
import com.almac2x.recyclerviewexercise.Fragments.Category_Fragment
import com.almac2x.recyclerviewexercise.Fragments.DesignerTab_fragment

class FragmentAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {

        when(position){
            1 -> return Category_Fragment()
            2 -> return Attention_Fragment()

        }

        return DesignerTab_fragment()
    }
}