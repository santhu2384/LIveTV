package com.example.livetv.domain.usecase

import com.example.livetv.domain.repository.LiveStreamRepository

class GetLiveStreamsUseCase(private val repository: LiveStreamRepository) {
    suspend operator fun invoke() = repository.getLiveStreams()
}
