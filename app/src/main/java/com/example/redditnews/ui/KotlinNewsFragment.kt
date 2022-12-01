package com.example.redditnews.ui

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import com.example.redditnews.R
import com.example.redditnews.adapters.NewsAdapter
import com.example.redditnews.adapters.NewsAdapter2
import com.example.redditnews.databinding.FragmentKotlinNewsBinding
import com.example.redditnews.utils.Status
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class KotlinNewsFragment : Fragment() {

    lateinit var binding: FragmentKotlinNewsBinding
    val viewModel: KotlinNewsViewModel by viewModels()
     var adapter= NewsAdapter()
    var adpter2 = NewsAdapter2()

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
        lifecycleScope.launch {
//            if (checkForInternet(requireContext())){
//                getOnlineData()
//            } else{
//                getOfflineData()
//            }

            viewModel.redditLiveData.observe(viewLifecycleOwner, Observer {
                adpter2.submitList(it)
                binding.recyclerView.adapter = adpter2
            })

        }
    }

//    suspend fun getOnlineData() {
//        viewModel.getOnlineNews().collect {
//            it.let {
//                when (it.status) {
//                    Status.SUCCESS -> {
//                        adapter.submitList(it.data?.data?.children )
//                        binding.recyclerView.adapter = adapter
//                        binding.progress.visibility = View.GONE
//                        binding.recyclerView.visibility = View.VISIBLE
//                    }
//                    Status.ERROR -> {
//                        Toast.makeText(requireContext(), it.message.toString(), Toast.LENGTH_SHORT)
//                            .show()
//                        binding.progress.visibility = View.GONE
//                        binding.recyclerView.visibility = View.VISIBLE
//                    }
//                    Status.LOADING -> {
//                        binding.progress.visibility = View.VISIBLE
//                        binding.recyclerView.visibility = View.INVISIBLE
//                    }
//                }
//            }
//        }
//    }

//    suspend fun getOfflineData(){
//        viewModel.getOfflineNews().collect{
//            it.let {
//                when (it.status) {
//                    Status.SUCCESS -> {
//                        adpter2.submitList(it.data)
//                        binding.recyclerView.adapter = adpter2
//                        binding.progress.visibility = View.GONE
//                        binding.recyclerView.visibility = View.VISIBLE
//                    }
//                    Status.ERROR -> {
//                        Toast.makeText(requireContext(), it.message.toString(), Toast.LENGTH_SHORT)
//                            .show()
//                        binding.progress.visibility = View.GONE
//                        binding.recyclerView.visibility = View.VISIBLE
//                    }
//                    Status.LOADING -> {
//                        binding.progress.visibility = View.VISIBLE
//                        binding.recyclerView.visibility = View.INVISIBLE
//                    }
//                }
//            }
//        }
//    }

    private fun checkForInternet(context: Context): Boolean {
        // register activity with the connectivity manager service
        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
        val network = connectivityManager.activeNetwork ?: return false

        // Representation of the capabilities of an active network.
        val activeNetwork = connectivityManager.getNetworkCapabilities(network) ?: return false
        return when {
            // Indicates this network uses a Wi-Fi transport,
            // or WiFi has network connectivity
            activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true

            // Indicates this network uses a Cellular transport. or
            // Cellular has network connectivity
            activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true

            // else return false
            else -> false
        }

    }


}