// ViewModel
package com.example.livetv.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.livetv.domain.model.LiveStream
import com.example.livetv.data.repository.LiveStreamRepositoryImpl
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LiveStreamViewModel @Inject constructor(
    private val repository: LiveStreamRepositoryImpl
) : ViewModel() {

    private val _liveStreams = MutableStateFlow<List<LiveStream>>(emptyList())
    val liveStreams: StateFlow<List<LiveStream>> = _liveStreams

    fun loadLiveStreams(channelId: String, apiKey: String) {
        viewModelScope.launch {
            try {
                val streams = repository.fetchLiveStreams(channelId, apiKey)
                _liveStreams.value = streams
            } catch (e: Exception) {
                _liveStreams.value = emptyList() // or handle error state
            }
        }
    }
}
