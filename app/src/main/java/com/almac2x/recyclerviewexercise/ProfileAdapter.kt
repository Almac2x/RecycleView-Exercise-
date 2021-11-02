package com.almac2x.recyclerviewexercise

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import java.security.Policy
import androidx.recyclerview.widget.RecyclerView
import com.almac2x.recyclerviewexercise.databinding.ItemProfilesBinding
import com.bumptech.glide.Glide


class ProfileAdapter(val context: Context, private val data:MutableList<Profile>): RecyclerView.Adapter<ProfileAdapter.MyViewHolder>(){

    lateinit var binding: ItemProfilesBinding

    inner class MyViewHolder (val binding: ItemProfilesBinding) :RecyclerView.ViewHolder(binding.root) {

        fun bindProjectInfo(name: String, title:String, rank : Int?, ) {

            binding.personTextView.text = name
            binding.titleTextView.text = title

        }

        fun bindImage(url: String?) {
            if (url != null) {
              Glide.with(context).load(url).into(binding.profileImageView)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileAdapter.MyViewHolder {
        val binding = ItemProfilesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProfileAdapter.MyViewHolder, position: Int) {
        val item = data[position]
        val name = "${item.firstName} ${item.lastName}"
        holder.bindImage(url = item.imageLoc)
        holder.bindProjectInfo(name = name, rank = item.ranking, title = item.title.toString())

    }

    override fun getItemCount(): Int {
        return data.size
    }
}