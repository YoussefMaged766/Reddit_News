package com.example.redditnews.repositories

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.redditnews.db.RedditEntity


@Dao
interface RedditDAO {

//    @Query("SELECT * FROM DataX ")
//    fun getAllNews(): List<DataX>

//    @Insert(onConflict =  OnConflictStrategy.REPLACE)
//    fun insert(dataX: DataX)



    @Query("SELECT * FROM RedditEntity")
    fun getAllNews(): List<RedditEntity>

    @Insert(onConflict =  OnConflictStrategy.REPLACE)
    suspend fun insert(redditEntity: List<RedditEntity>)
}