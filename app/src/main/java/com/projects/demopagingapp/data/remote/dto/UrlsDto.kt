package com.projects.demopagingapp.data.remote.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UrlsDto(
    @SerialName("regular")
    val regular:String
)
