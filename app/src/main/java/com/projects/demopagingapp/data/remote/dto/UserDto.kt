package com.projects.demopagingapp.data.remote.dto

import androidx.room.Embedded
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserDto(
    @SerialName("links")
    @Embedded
    val userLinks:UserLinksDto,
    val username:String
)
