package com.projects.demopagingapp.di

import android.app.Application
import androidx.room.Room
import com.projects.demopagingapp.data.common.Constants.DATABASE_NAME
import com.projects.demopagingapp.data.local.ImageDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomDatabaseModule {
    @Provides
    @Singleton
    fun providesDatabase(app:Application):ImageDatabase{
        return Room.databaseBuilder(app,ImageDatabase::class.java,DATABASE_NAME)
            .build()
    }
}