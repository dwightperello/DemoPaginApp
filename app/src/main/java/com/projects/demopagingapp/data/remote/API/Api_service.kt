package com.projects.demopagingapp.data.remote.API

import com.projects.demopagingapp.BuildConfig
import com.projects.demopagingapp.data.remote.dto.ImageDto
import com.projects.demopagingapp.domain.model.ImageItem
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface Api_service {

    @Headers("Authorization: Client-ID ${BuildConfig.API_KEY}")
    @GET("/photos")
    suspend fun getAllImages(
        @Query("page") page:Int,
        @Query("per_page") per_page:Int
    ):List<ImageDto>


    @Headers("Authorization: Client-ID ${BuildConfig.API_KEY}")
    @GET("/search/photos")
    suspend fun searchImages(
        @Query("page") page:Int,
        @Query("per_page") per_page:Int
    ):List<ImageDto>


}