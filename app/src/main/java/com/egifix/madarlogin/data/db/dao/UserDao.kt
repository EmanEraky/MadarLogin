package com.egifix.madarlogin.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.egifix.madarlogin.data.db.entities.User

@Dao
interface UserDao {

    @Query("SELECT * From usersTable")
    suspend fun getAll(): List<User>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(user: User): Long

}