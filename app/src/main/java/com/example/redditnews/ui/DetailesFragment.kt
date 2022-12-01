package com.example.redditnews.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.bumptech.glide.Glide
import com.example.redditnews.R
import com.example.redditnews.databinding.FragmentDetailesBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailesFragment : Fragment() {

    private val viewModel: DetailsViewModel by viewModels()
    lateinit var binding: FragmentDetailesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentDetailesBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observeData()


    }

    private fun observeData() {
        //observe data from Room
        viewModel.redditLiveData.observe(viewLifecycleOwner, Observer {
            // set title of toolbar
            (activity as KotlinNewsActivity).supportActionBar?.title = it?.title.toString()

            Glide.with(requireContext()).load(it?.thumbnail).placeholder(R.drawable.no_image)
                .into(binding.imgReddit)
            binding.txtBody.text = it?.selfText
            binding.txtSubreddit.text = it?.subreddit
            binding.txtAuther.text = "Posted by ${it?.authorFullName}"
            binding.txtHere.setOnClickListener { i ->
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(it?.url)))
            }
        })
    }


}