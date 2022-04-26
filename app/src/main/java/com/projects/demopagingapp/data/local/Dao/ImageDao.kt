package com.projects.demopagingapp.data.local.Dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.projects.demopagingapp.domain.model.ImageItem

@Dao
interface ImageDao {

    @Query("Select * from image_table")
    suspend fun getAllImages():PagingSource<Int,ImageItem>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addImages(images:List<ImageItem>)

    @Query("Delete From image_table")
    suspend fun deleteAllImages()

}