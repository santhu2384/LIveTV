plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "com.example.livetv"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.livetv"
        minSdk = 23
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        buildConfigField("String", "YOUTUBE_API_KEY", "\"PASTE YOUR KEY HERE\"")    }

    buildFeatures {
        compose = true
        buildConfig = true // ✅ Enable this
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.10" // match Compose version
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    // Compose
    implementation("androidx.compose.ui:ui:1.6.1")
    implementation("androidx.compose.material3:material3:1.2.1")
    implementation("androidx.compose.ui:ui-tooling-preview:1.6.1")
    debugImplementation("androidx.compose.ui:ui-tooling:1.6.1")

    // Lifecycle & ViewModel
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.7.0")

    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.11.0")
    implementation("com.squareup.retrofit2:converter-gson:2.11.0")

    // Hilt
    implementation("com.google.dagger:hilt-android:2.51")
    kapt("com.google.dagger:hilt-compiler:2.51")
    implementation("androidx.hilt:hilt-navigation-compose:1.2.0") // ✅ MISSING

    // Kotlin Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.8.0")

    // Optional: Image loading
    implementation("io.coil-kt:coil-compose:2.6.0")
}
