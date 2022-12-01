package com.example.redditnews.utils

import androidx.room.TypeConverter
import com.example.redditnews.module.Data
import com.example.redditnews.module.NewsData
import com.google.gson.Gson


class TypeConverters {
    @TypeConverter
    fun fromNewsToGson(newsData: NewsData): String {
        return Gson().toJson(newsData)
    }
    @TypeConverter
    fun fromGsonToNews(news: String): NewsData {
        return Gson().fromJson(news, NewsData::class.java)
    }

    @TypeConverter
    fun fromDataToGson(newsData: Data): String {
        return Gson().toJson(newsData)
    }
    @TypeConverter
    fun fromGsonToData(news: String): Data {
        return Gson().fromJson(news, Data::class.java)
    }
}