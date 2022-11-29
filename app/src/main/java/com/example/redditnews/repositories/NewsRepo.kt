package com.example.redditnews.repositories

import com.example.redditnews.utils.Resource
import com.example.redditnews.utils.WebServices
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject


class NewsRepo @Inject constructor(private val  webServices: WebServices) {
    suspend fun getOnlineNews() = flow {
        emit(Resource.loading(null))
        val response = webServices.getArticles()
        try {
            if (response.isSuccessful && response.code()==200){
                emit(Resource.success(response.body().toString()))
            }
        } catch (e:Exception){
            emit(Resource.error(null , e.message.toString()))
        }

    }.flowOn(Dispatchers.IO)
}