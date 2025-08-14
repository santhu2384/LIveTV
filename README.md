# 📺 LiveTV App

LiveTV is an Android app built with **Kotlin** and **Jetpack Compose** that lets users browse and watch live TV channels via **YouTube API integration**.  
This project demonstrates **MVVM + Clean Architecture** along with **Hilt, Retrofit, and Jetpack Compose**.

---

## ✨ Features
- 🎬 Fetch and display YouTube video lists (Live TV channels)
- 🔍 Search functionality for channels/videos
- 📱 Modern UI with Jetpack Compose
- ⚡ Optimized with coroutines & Flow
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
5. Add your API key in the app:
   - Open `app/src/main/java/com/example/livetv/utils/Constants.kt` (or wherever you store constants)
   - Replace:
     ```kotlin
     const val YOUTUBE_API_KEY = "YOUR_API_KEY_HERE"
     ```
6. Rebuild and run the app

---

## 🚀 How to Run
```bash
# Clone the repository
git clone https://github.com/your-username/LiveTV.git

# Open in Android Studio
# Add your API key (see above)
# Run on an emulator or device
