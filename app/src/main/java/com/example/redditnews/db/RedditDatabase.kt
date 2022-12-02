package com.example.redditnews.db

import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = [RedditEntity::class], version = 1)
abstract class RedditDatabase :RoomDatabase(){
    abstract fun redditDao() : RedditDAO
}