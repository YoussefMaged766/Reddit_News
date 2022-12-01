package com.example.redditnews.repositories

//import com.example.redditnews.db.RedditDatabase

import com.example.redditnews.db.RedditDatabase
import com.example.redditnews.module.Children
import com.example.redditnews.module.DataX
import com.example.redditnews.module.mapper.toListRedditEntity
import com.example.redditnews.module.mapper.toRedditEntity
import com.example.redditnews.utils.Resource
import com.example.redditnews.utils.WebServices
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.withContext
import javax.inject.Inject


class NewsRepo @Inject constructor(
    private val webServices: WebServices,
    val database: RedditDatabase
) {
    val gson = Gson()
    suspend fun getOnlineNews() = flow {
        val mDao = database.redditDao()
        try {
            emit(Resource.loading(null))

            // getting old or last saved data from room
            val oldData = mDao.getAllNews()
            emit(Resource.success(oldData))
            delay(1000L)

            // make api call to fetch new data
            val remoteResult = webServices.getArticles()

            // if response successful the new data will be inserted into room database
            if (remoteResult.isSuccessful) {
                remoteResult.body()?.let {
                    mDao.insert(it.toListRedditEntity())
                }
            }


//            val response = webServices.getArticles()
//
//            if (response.isSuccessful && response.code() == 200) {
////                val type = object : TypeToken<Children>() {}.type
////                val errorResponse: Children? =
////                    gson.fromJson(response.errorBody().charStream(), type)
//                emit(Resource.success(response.body()))
//
//                delay(2000)
//                val size = response.body()?.data!!.children.size
////                if (database.redditDao().getAllNews().isEmpty()){
////
////                }
//                for (i in 0..size) {
//                    insertNews(response.body()?.data!!.children[i].data)
//                }

    } catch (e: Exception) {

        emit(Resource.error(null, e.message.toString()))
    }
        //this variable will contains last inserted data no matter if its new or old
        val lastInsertedData = mDao.getAllNews()
        emit(Resource.success(lastInsertedData))
    }.flowOn(Dispatchers.IO)



}



//    suspend fun getOfflineNews() = flow {
//        emit(Resource.loading(null))
//        try {
//            emit(Resource.success(database.redditDao().getAllNews()))
//        } catch (e: Exception) {
//            emit(Resource.error(null, e.message.toString()))
//        }
//    }.flowOn(Dispatchers.IO)
//
//    suspend fun insertNews(dataX: DataX) {
//        database.redditDao().insert(dataX)
//    }
