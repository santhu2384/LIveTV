package com.example.livetv.data.model

data class LiveStreamDto(
    val title: String,
    val videoId: String
)

// LiveStreamDto.kt
data class YouTubeResponse(
    val items: List<YouTubeItem>
)

data class YouTubeItem(
    val id: VideoId,
    val snippet: Snippet
)

data class VideoId(
    val videoId: String
)

data class Snippet(
    val title: String,
    val thumbnails: Thumbnails
)

data class Thumbnails(
    val medium: Thumbnail
)

data class Thumbnail(
    val url: String
)
