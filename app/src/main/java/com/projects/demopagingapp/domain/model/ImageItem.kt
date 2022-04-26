package com.projects.demopagingapp.domain.model

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.projects.demopagingapp.data.common.Constants
import com.projects.demopagingapp.data.remote.dto.UrlsDto
import com.projects.demopagingapp.data.remote.dto.UserDto
import kotlinx.serialization.Serializable

@Serializable
@Entity(tableName = Constants.TABLE_NAME)
data class ImageItem(
    @PrimaryKey(autoGenerate = false)
    val id:String,
    @Embedded
    val urls: UrlsDto,
    val likes:Int,
    @Embedded
    val user:UserDto
)
