package com.example.redditnews.utils

import com.example.redditnews.module.NewsResponse
import retrofit2.Response
import retrofit2.http.GET

interface WebServices {

    @GET("r/kotlin/.json")
   suspend fun getArticles():Response<List<NewsResponse>>
}