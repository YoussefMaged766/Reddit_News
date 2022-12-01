package com.example.redditnews.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.redditnews.module.DataX

import com.example.redditnews.repositories.RedditDAO


@Database(entities = [RedditEntity::class], version = 1)
@TypeConverters(com.example.redditnews.utils.TypeConverters::class)
abstract class RedditDatabase :RoomDatabase(){
    abstract fun redditDao() :RedditDAO
}