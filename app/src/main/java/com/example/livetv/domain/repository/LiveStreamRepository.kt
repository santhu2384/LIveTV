package com.example.livetv.domain.repository

import com.example.livetv.domain.model.LiveStream

interface LiveStreamRepository {
    suspend fun fetchLiveStreams(channelId: String, apiKey: String): List<LiveStream>
    suspend fun getLiveStreams(): List<LiveStream>
}
