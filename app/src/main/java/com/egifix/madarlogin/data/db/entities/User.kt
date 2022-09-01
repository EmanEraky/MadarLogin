package com.egifix.madarlogin.data.db.entities

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "usersTable",indices = [Index(value = ["userName","jobTitle","age"], unique = true)])
data class User(
    @PrimaryKey(autoGenerate = true)
    val userID:Int,
    val userName: String,
    val age: String,
    val jobTitle: String,
    val gender: String
)