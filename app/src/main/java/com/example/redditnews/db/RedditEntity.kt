package com.example.redditnews.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class RedditEntity(
    @PrimaryKey
    val id: String,
    val authorFullName: String ?=null,
    val thumbnail: String? = null,
    val title: String? = null,
    val url: String? = null,
    val selfText: String? = null,
    val subreddit: String? = null,
)
