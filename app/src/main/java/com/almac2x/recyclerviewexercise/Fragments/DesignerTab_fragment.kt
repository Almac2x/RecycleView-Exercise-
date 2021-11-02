package com.almac2x.recyclerviewexercise.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.inflate
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.almac2x.recyclerviewexercise.ProfileAdapter
import com.almac2x.recyclerviewexercise.R
import com.almac2x.recyclerviewexercise.databinding.FragmentDesignerTabFragmentBinding
import com.almac2x.recyclerviewexercise.viewmodel.MyViewModel


class DesignerTab_fragment : Fragment(R.layout.fragment_designer_tab_fragment) {

    lateinit var myViewModel : MyViewModel
    lateinit var binding: FragmentDesignerTabFragmentBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        myViewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        binding = FragmentDesignerTabFragmentBinding.bind(view)

        val rcv = binding.rcsv
        rcv?.adapter = ProfileAdapter(requireContext(),myViewModel.profile)

    }


}