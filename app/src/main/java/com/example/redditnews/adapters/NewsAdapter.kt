package com.example.redditnews.adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.redditnews.R
import com.example.redditnews.databinding.NewsItemBinding
import com.example.redditnews.db.RedditEntity

import com.example.redditnews.ui.KotlinNewsFragmentDirections


class NewsAdapter() : ListAdapter<RedditEntity, NewsAdapter.viewholder>(Companion) {

    class viewholder(var binding: NewsItemBinding) : ViewHolder(binding.root) {
        fun bind(data: RedditEntity) {
            binding.txtTitle.text = data.title
            Glide.with(binding.root.context).load(data.thumbnail).placeholder(R.drawable.no_image)
                .into(binding.imgReddit)
        }

    }

    companion object : DiffUtil.ItemCallback<RedditEntity>() {
        override fun areItemsTheSame(oldItem: RedditEntity, newItem: RedditEntity): Boolean {

            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: RedditEntity, newItem: RedditEntity): Boolean {
            return oldItem.id == newItem.id
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        val binding = NewsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return viewholder(binding)
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        holder.bind(getItem(position))

        // navigate to Details Fragment
        holder.binding.root.setOnClickListener {
            val id = getItem(position).id
            it.findNavController()
                .navigate(KotlinNewsFragmentDirections.actionKotlinNewsFragmentToDetailesFragment(id))

        }
    }


}