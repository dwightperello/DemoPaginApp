package com.projects.demopagingapp.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.projects.demopagingapp.data.common.Constants.REMOTE_KEYS

@Entity(tableName =REMOTE_KEYS )
data class RemoteKeys(
    @PrimaryKey(autoGenerate = false)
    val id:String,
    val prevPage:Int?,
    val nextPage:Int?
)
