package com.example.redditnews.ui.details

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
class DetailsViewModel @Inject constructor(
    private val newsRepo: NewsRepo,
    private val savedStateHandle: SavedStateHandle
) : ViewModel() {
    private val _id = MutableLiveData<String>()
    val id: LiveData<String> get() = _id


    init {
        // compare id from room with id from NewsFragment that is clicked
        savedStateHandle.get<String>("id")?.let { idFromHomeScreen ->
            if (!idFromHomeScreen.isNullOrBlank()){
                _id.value = idFromHomeScreen
            }
        }
        getDetails(id.value.toString())
    }
    private val _redditLiveData = MutableLiveData<RedditEntity?>()
    val redditLiveData: LiveData<RedditEntity?> get() = _redditLiveData


    private fun getDetails(id:String) = viewModelScope.launch (Dispatchers.IO){
        newsRepo.getNewsDetails(id).collectLatest {
            when(it.status){
                Status.LOADING->{}
                Status.SUCCESS->{
                    _redditLiveData.postValue(it.data)
                }
                Status.ERROR->{}
            }
        }
    }
}