buildscript {
    val kotlinVersion by extra("1.9.22") // Define kotlin_version explicitly

    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        classpath("com.google.dagger:hilt-android-gradle-plugin:2.51.1")
    }
}

plugins {
    id("com.android.application") version "8.2.2" apply false
    id("com.android.library") version "8.2.2" apply false
    id("org.jetbrains.kotlin.android") version "1.9.22" apply false // ✅ fix this
   // id("com.google.dagger.hilt.android") version "2.51.1" apply false
   // id("org.jetbrains.kotlin.plugin.compose") version "2.0.0" apply false

}


