package com.example.redditnews.module.mapper

import com.example.redditnews.db.RedditEntity
import com.example.redditnews.module.NewsData


    fun NewsData.toListRedditEntity():List<RedditEntity>{
        val redditList = mutableListOf<RedditEntity>()
        this.data.children.onEach {
            redditList.add(
                RedditEntity(it.data.id,
                    it.data.author_fullname,
                    it.data.thumbnail,
                    it.data.title,
                    it.data.url,
                    it.data.selftext,
                    it.data.subreddit
                )
            )
        }
        return redditList
    }


