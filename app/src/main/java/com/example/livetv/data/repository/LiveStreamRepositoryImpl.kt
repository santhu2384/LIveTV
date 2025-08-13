package com.example.livetv.data.repository

import com.example.livetv.data.remote.LiveStreamApi
import com.example.livetv.domain.model.LiveStream
import com.example.livetv.domain.repository.LiveStreamRepository
import javax.inject.Inject

class LiveStreamRepositoryImpl @Inject constructor(private val api: LiveStreamApi): LiveStreamRepository {
    override suspend fun fetchLiveStreams(channelId: String, apiKey: String): List<LiveStream> {
        val response = api.getLiveVideos(channelId = channelId, apiKey = apiKey)
        return response.items.map {
            LiveStream(
                title = it.snippet.title,
                videoId = it.id.videoId
            )
        }
    }

    override suspend fun getLiveStreams(): List<LiveStream> {
        TODO("Not yet implemented")
    }

}
