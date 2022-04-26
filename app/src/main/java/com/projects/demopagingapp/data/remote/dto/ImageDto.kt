package com.projects.demopagingapp.data.remote.dto

import com.projects.demopagingapp.domain.model.ImageItem
import kotlinx.serialization.Serializable

@Serializable
data class ImageDto(
    val id:String,
    val urls:UrlsDto,
    val likes:Int,
    val user:UserDto
)

fun ImageDto.toImageItem():ImageItem{
    return ImageItem(
        id=id,
        urls = urls,
        likes = likes,
        user = user
    )
}
