package com.example.redditnews.repositories

import androidx.room.Dao
import androidx.room.Query
import com.example.redditnews.module.NewsResponse
import kotlinx.coroutines.flow.Flow


@Dao
interface redditDAO {

    @Query("SELECT * FROM NewsResponse ")
    fun getAllNews(): Flow<List<NewsResponse>>
}