# 📺 LiveTV App

LiveTV is an Android app built with **Kotlin** and **Jetpack Compose** that lets users browse and watch live TV channels via **YouTube API integration**.  
It follows **MVVM + Clean Architecture** principles with **Hilt**, **Retrofit**, and **Coroutines** for a clean, scalable, and testable codebase.

---

## ✨ Features
- 🎬 Fetch and display YouTube video lists (Live TV channels)
- 🔍 Search functionality for channels/videos
- 📱 Modern UI with Jetpack Compose
- ⚡ Reactive data flow with Coroutines & Flow
- 🗂️ MVVM + Clean Architecture for scalability

---

## 🛠️ Tech Stack
- **Language:** Kotlin  
- **UI:** Jetpack Compose  
- **Architecture:** MVVM + Clean Architecture  
- **Dependency Injection:** Hilt  
- **Networking:** Retrofit + Coroutines  
- **API:** YouTube Data API v3  

---

## 🔑 Setting up API Key
This app uses the **YouTube Data API v3** to fetch video/channel details.

1. Go to [Google Cloud Console](https://console.cloud.google.com/)
2. Create or select an existing project
3. Enable **YouTube Data API v3**
4. Go to **APIs & Services → Credentials** and create an **API Key**
YOUTUBE_API_KEY=YOUR_API_KEY_HERE

5. In `app/build.gradle`, make sure you have:
```gradle
defaultConfig {
    ...
    buildConfigField "String", "YOUTUBE_API_KEY", "\"${YOUTUBE_API_KEY}\""
}


Access it anywhere in your app using:

val apiKey = BuildConfig.YOUTUBE_API_KEY


Rebuild and run the app.
