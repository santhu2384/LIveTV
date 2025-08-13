package com.example.livetv.data.remote

import com.example.livetv.data.model.LiveStreamDto
import com.example.livetv.data.model.YouTubeResponse
import retrofit2.http.GET
import retrofit2.http.Query


interface LiveStreamApi {
    @GET("youtube/v3/search")
    suspend fun getLiveVideos(
        @Query("part") part: String = "snippet",
        @Query("channelId") channelId: String,
        @Query("type") type: String = "video",
        @Query("eventType") eventType: String = "live",
        @Query("key") apiKey: String
    ): YouTubeResponse
}

