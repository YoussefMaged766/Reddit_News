package com.example.redditnews.ui

import androidx.lifecycle.ViewModel
import com.example.redditnews.repositories.NewsRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class KotlinNewsViewModel @Inject constructor(private val newsRepo: NewsRepo)  :ViewModel() {
    suspend fun getOnlineNews() = newsRepo.getOnlineNews()
//    suspend fun getOfflineNews() = newsRepo.getOfflineNews()

}