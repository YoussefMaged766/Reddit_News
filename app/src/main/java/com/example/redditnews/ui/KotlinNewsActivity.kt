package com.example.redditnews.ui


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.redditnews.R
import com.example.redditnews.databinding.ActivityKotlinNewsBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class KotlinNewsActivity : AppCompatActivity() {
    lateinit var binding: ActivityKotlinNewsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKotlinNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.actionBar.toolbar)
        // make back arrow in toolbar
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_activity_home) as NavHostFragment
        val navController = navHostFragment.navController
        val config = AppBarConfiguration(navController.graph)
        binding.actionBar.toolbar.setupWithNavController( navController,config)
    }

}