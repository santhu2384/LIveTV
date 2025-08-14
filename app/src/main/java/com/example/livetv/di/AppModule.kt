package com.example.livetv.di

import com.example.livetv.data.remote.LiveStreamApi
import com.example.livetv.data.repository.LiveStreamRepositoryImpl
import com.example.livetv.domain.repository.LiveStreamRepository
import com.example.livetv.domain.usecase.GetLiveStreamsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    private const val BASE_URL = "https://www.googleapis.com/"

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL) // ✅ must end with `/`
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun provideLiveStreamApi(retrofit: Retrofit): LiveStreamApi {
        return retrofit.create(LiveStreamApi::class.java)
    }


    @Provides
    fun provideLiveStreamRepository(
        api: LiveStreamApi
    ): LiveStreamRepository {
        return LiveStreamRepositoryImpl(api)
    }


    @Provides
    fun provideUseCase(repository: LiveStreamRepository): GetLiveStreamsUseCase {
        return GetLiveStreamsUseCase(repository)
    }
}
