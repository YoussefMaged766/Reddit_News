package com.example.redditnews.repositories

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.redditnews.db.RedditEntity


@Dao
interface RedditDAO {

    //get All Articles
    @Query("SELECT * FROM RedditEntity")
    fun getAllNews(): List<RedditEntity>

    //Save All Articles
    @Insert(onConflict =  OnConflictStrategy.REPLACE)
    suspend fun insert(redditEntity: List<RedditEntity>)

    // Search for article using Specific key
    @Query("SELECT * FROM RedditEntity WHERE id=:id")
    fun getNewDetailes(id:String): RedditEntity
}