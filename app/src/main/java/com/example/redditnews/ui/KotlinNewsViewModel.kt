package com.example.redditnews.ui

import android.view.View
import androidx.lifecycle.*
import com.example.redditnews.db.RedditEntity
import com.example.redditnews.repositories.NewsRepo
import com.example.redditnews.utils.Status
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class KotlinNewsViewModel @Inject constructor(
    private val newsRepo: NewsRepo,
//    private val savedStateHandle: SavedStateHandle
) :ViewModel() {
//    suspend fun getOnlineNews() = newsRepo.getOnlineNews()
//    suspend fun getOfflineNews() = newsRepo.getOfflineNews()

//    private val _id = MutableLiveData<String>("")
//    val id: LiveData<String> get() = _id
//
//    init {
//        savedStateHandle.get<String>("id")?.let { idFromHomeScreen ->
//            if (!idFromHomeScreen.isNullOrBlank()){
//                _id.postValue(idFromHomeScreen)
//            }
//        }
//
//        getDetails(id.value.toString())
//    }
    private val _redditLiveData = MutableLiveData<List<RedditEntity>?>()
    val redditLiveData: LiveData<List<RedditEntity>?> get() = _redditLiveData

    private val _progressLiveData = MutableLiveData<Int>()
    val progressLiveData: LiveData<Int> get() = _progressLiveData

    private val _recyclerLiveData = MutableLiveData<Int>()
    val recyclerLiveData: LiveData<Int> get() = _recyclerLiveData

//    private val _detailsLiveData = MutableLiveData<RedditEntity?>()
//    val detailsLiveData: LiveData<RedditEntity?> get() = _detailsLiveData

    init {
        getReddit()

    }

    private fun getReddit() = viewModelScope.launch(Dispatchers.IO){

        newsRepo.getOnlineNews().collectLatest { resource ->
            when(resource.status){
              Status.LOADING -> {
                  _progressLiveData.postValue(View.VISIBLE)
                  _recyclerLiveData.postValue(View.INVISIBLE)
              }
              Status.SUCCESS -> {
                  _redditLiveData.postValue(resource.data)
                  _progressLiveData.postValue(View.INVISIBLE)
                  _recyclerLiveData.postValue(View.VISIBLE)
              }
              Status.ERROR -> {
                  _progressLiveData.postValue(View.INVISIBLE)
                  _recyclerLiveData.postValue(View.VISIBLE)
              }
            }
        }

    }



}