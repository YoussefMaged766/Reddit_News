package com.example.redditnews.repositories



import android.util.Log
import com.example.redditnews.db.RedditDatabase
import com.example.redditnews.module.mapper.toListRedditEntity
import com.example.redditnews.utils.Resource
import com.example.redditnews.utils.WebServices
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject


class NewsRepo @Inject constructor(
    private val webServices: WebServices,
    private val database: RedditDatabase
) {

    suspend fun getOnlineNews() = flow {
        val mDao = database.redditDao()
        try {
            // make api call to fetch new data
            val remoteResult = webServices.getArticles()
            emit(Resource.loading(null))



            // if response successful the new data will be inserted into room database
            if (remoteResult.isSuccessful) {
                emit(Resource.success(remoteResult.body()?.toListRedditEntity()))
                remoteResult.body()?.let {
                    mDao.insert(it.toListRedditEntity())
                }

            }else {
                try {
                    val oldData = mDao.getAllNews()
                    emit(Resource.success(oldData))
                }catch (e:Exception){
                    emit(Resource.error(null, e.message.toString()))
                }
            }

        } catch (e: Exception) {

            emit(Resource.error(null, e.message.toString()))
            Log.e( "getOnlineNews: ", e.message.toString())
        }
        //this variable will contains last inserted data no matter if its new or old
        val lastInsertedData = mDao.getAllNews()
        emit(Resource.success(lastInsertedData))

    }.flowOn(Dispatchers.IO)

    suspend fun getNewsDetails(id:String) = flow {
        emit(Resource.loading(null))
        val mDao = database.redditDao()
        try {
            emit(Resource.loading(null))

            // getting old or last saved data from room using specific id
            val oldData = mDao.getNewDetailes(id = id)
            emit(Resource.success(oldData))
            delay(1000L)

        } catch (e: Exception) {

            emit(Resource.error(null, e.message.toString()))
        }
        //this variable will contains last inserted data no matter if its new or old
        val lastInsertedData = mDao.getNewDetailes(id)
        emit(Resource.success(lastInsertedData))

    }.flowOn(Dispatchers.IO)
}

