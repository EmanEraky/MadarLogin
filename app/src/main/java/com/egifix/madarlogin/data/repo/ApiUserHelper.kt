package com.egifix.madarlogin.data.repo

import com.egifix.madarlogin.data.db.entities.User
import com.egifix.madarlogin.utils.Resource
import kotlinx.coroutines.flow.Flow

interface ApiUserHelper {
    suspend fun getAll(): Flow<Resource<List<User>>>
    suspend fun insertUser(user: User): Flow<Resource<Long>>




}