package com.projects.demopagingapp.data.local.Dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.projects.demopagingapp.domain.model.RemoteKeys

@Dao
interface RemoteKeysDao {
    @Query("Select * from remote_keys_table where id=:id")
    suspend fun getRemoteKeys(id:String):RemoteKeys

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun AddAllRemoteKeys(remotekeys:List<RemoteKeys>)

    @Query("delete from remote_keys_table")
    suspend fun deleteRemoteKeys()
}