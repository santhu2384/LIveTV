package com.example.livetv

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.livetv.presentation.screen.LiveStreamScreen
import com.example.livetv.presentation.viewmodel.LiveStreamViewModel
import com.example.livetv.ui.theme.LiveTVTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                val viewModel: LiveStreamViewModel = hiltViewModel()
                LiveStreamScreen(
                    viewModel = viewModel,
                    channelId = "UCPXTXMecYqnRKNdqdVOGSFg", // Replace with your channel ID
                    apiKey = BuildConfig.YOUTUBE_API_KEY // Securely store in local.properties
                )
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LiveTVTheme {
        Greeting("Android")
    }
}