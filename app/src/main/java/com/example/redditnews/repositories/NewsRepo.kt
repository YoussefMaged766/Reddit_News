package com.example.redditnews.repositories

//import com.example.redditnews.db.RedditDatabase

import com.example.redditnews.utils.Resource
import com.example.redditnews.utils.WebServices
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject


class NewsRepo @Inject constructor(private val  webServices: WebServices ) {
    val gson = Gson()
    suspend fun getOnlineNews() = flow {
        emit(Resource.loading(null))
        val response = webServices.getArticles()
        try {
            if (response.isSuccessful && response.code()==200){
//                val type = object : TypeToken<NewsResponse>() {}.type
//                val errorResponse: NewsResponse? =
//                    gson.fromJson(response, type)
                emit(Resource.success(response.body()))
            }
        } catch (e:Exception){
            emit(Resource.error(null , e.message.toString()))
        }

    }.flowOn(Dispatchers.IO)

//    suspend fun getOfflineNews() = flow {
//     emit(Resource.loading(null))
//     try {
//         emit(Resource.success(database.redditDao().getAllNews()))
//     }   catch (e:Exception){
//         emit(Resource.error(null , e.message.toString()))
//     }
//    }.flowOn(Dispatchers.IO)
}