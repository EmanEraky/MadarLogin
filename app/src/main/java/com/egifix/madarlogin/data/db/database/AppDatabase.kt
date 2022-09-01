package com.egifix.madarlogin.data.db.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.egifix.madarlogin.data.db.dao.UserDao
import com.egifix.madarlogin.data.db.entities.User

@Database(entities = [User::class], version = 2)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao

    companion object {
        val DATABASE_NAME: String = "general_database"
    }
}