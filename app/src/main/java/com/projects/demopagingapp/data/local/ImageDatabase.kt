package com.projects.demopagingapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.projects.demopagingapp.data.local.Dao.ImageDao
import com.projects.demopagingapp.data.local.Dao.RemoteKeysDao
import com.projects.demopagingapp.domain.model.ImageItem
import com.projects.demopagingapp.domain.model.RemoteKeys

@Database(entities = [ImageItem::class,RemoteKeys::class], version = 1)
abstract class ImageDatabase :RoomDatabase() {

    abstract fun unsplashImageDao():ImageDao
    abstract fun unsplashRemoteKeysDao():RemoteKeysDao
}