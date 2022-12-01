package com.example.redditnews.ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import com.example.redditnews.adapters.NewsAdapter
import com.example.redditnews.databinding.FragmentKotlinNewsBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch


@AndroidEntryPoint
class KotlinNewsFragment : Fragment() {

    lateinit var binding: FragmentKotlinNewsBinding
    private val viewModel: KotlinNewsViewModel by viewModels()
    var adapter = NewsAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentKotlinNewsBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observeData()

    }

  private fun observeData() {
        lifecycleScope.launch {
            viewModel.redditLiveData.observe(viewLifecycleOwner, Observer {
                adapter.submitList(it)
                binding.recyclerView.adapter = adapter
            })

            viewModel.progressLiveData.observe(viewLifecycleOwner, Observer {
                binding.progress.visibility = it
            })
            viewModel.recyclerLiveData.observe(viewLifecycleOwner, Observer {
                binding.recyclerView.visibility = it
            })

        }
    }


}