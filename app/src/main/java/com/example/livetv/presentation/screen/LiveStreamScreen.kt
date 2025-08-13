package com.example.livetv.presentation.screen

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.livetv.domain.model.LiveStream
import com.example.livetv.presentation.viewmodel.LiveStreamViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LiveStreamScreen(
    viewModel: LiveStreamViewModel,
    channelId: String,
    apiKey: String
) {
    val context = LocalContext.current
    val liveStreams by viewModel.liveStreams.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.loadLiveStreams(channelId, apiKey)
    }

    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Live TV") })
        }
    ) { padding ->
        LazyColumn(modifier = Modifier.padding(padding)) {
            items(liveStreams) { stream ->
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            val intent = Intent(
                                Intent.ACTION_VIEW,
                                Uri.parse("https://www.youtube.com/watch?v=${stream.videoId}")
                            )
                            context.startActivity(intent)
                        }
                        .padding(16.dp)
                ) {
                    Text(text = stream.title, style = MaterialTheme.typography.bodyLarge)
                }
                Divider()
            }
        }
    }
}