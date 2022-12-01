package com.example.redditnews.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.redditnews.db.RedditEntity
import com.example.redditnews.repositories.NewsRepo
import com.example.redditnews.utils.Status
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class KotlinNewsViewModel @Inject constructor(private val newsRepo: NewsRepo)  :ViewModel() {
//    suspend fun getOnlineNews() = newsRepo.getOnlineNews()
//    suspend fun getOfflineNews() = newsRepo.getOfflineNews()

    private val _redditLiveData = MutableLiveData<List<RedditEntity>?>()
    val redditLiveData: LiveData<List<RedditEntity>?> get() = _redditLiveData

    init {
        getReddit()
    }

    private fun getReddit() = viewModelScope.launch(Dispatchers.IO){

        newsRepo.getOnlineNews().collectLatest { resource ->
            when(resource.status){
              Status.LOADING -> {}
              Status.SUCCESS -> {
                  _redditLiveData.postValue(resource.data)
              }
              Status.ERROR -> {}
            }
        }

    }

}