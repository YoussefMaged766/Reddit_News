package com.example.redditnews.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.redditnews.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class KotlinNewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_news)
    }
}