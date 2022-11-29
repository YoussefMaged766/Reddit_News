package com.example.redditnews.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.redditnews.R
import com.example.redditnews.databinding.NewsItemBinding
import com.example.redditnews.module.Children

import com.example.redditnews.module.Data
import com.example.redditnews.module.NewsData


class NewsAdapter() :ListAdapter<Children, NewsAdapter.viewholder>(Companion) {

    class viewholder(var binding: NewsItemBinding) : ViewHolder(binding.root){
        fun bind(data :Children){
            binding.txtTitle.text = data.data.title
            Glide.with(binding.root.context).load(data.data.thumbnail).placeholder(R.drawable.ic_launcher_foreground).into(binding.imgReddit)
        }

    }
    companion object : DiffUtil.ItemCallback<Children>() {
        override fun areItemsTheSame(oldItem: Children, newItem: Children): Boolean {

            return  oldItem.data.id == newItem.data.id
        }

        override fun areContentsTheSame(oldItem: Children, newItem: Children): Boolean {
            return  oldItem.data.id == newItem.data.id
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        val binding = NewsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return viewholder(binding)
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        holder.bind(getItem(position))
    }


}