package com.projects.demopagingapp.di

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.projects.demopagingapp.data.common.Constants
import com.projects.demopagingapp.data.remote.API.Api_service
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@ExperimentalSerializationApi
@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    @Singleton
    fun provideHttpClient():OkHttpClient{
        return OkHttpClient.Builder()
            .readTimeout(16,TimeUnit.SECONDS)
            .connectTimeout(16,TimeUnit.SECONDS)
            .build()
    }
    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient):Retrofit{
        val contentType= "application/json".toMediaType()
        val json= Json {
            ignoreUnknownKeys = true
        }
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(Json.asConverterFactory(contentType))
            .build()

    }

    @Provides
    @Singleton
    fun provideAPI(retrofit: Retrofit):Api_service {
        return retrofit.create(Api_service::class.java)
    }

}