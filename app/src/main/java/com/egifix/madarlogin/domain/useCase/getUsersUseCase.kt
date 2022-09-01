package com.egifix.madarlogin.domain.useCase

import com.egifix.madarlogin.data.db.entities.User
import com.egifix.madarlogin.data.repo.ApiUserHelper
import javax.inject.Inject

class getUsersUseCase @Inject constructor(private val apiHelper: ApiUserHelper) {


    suspend fun insertUser(user: User) =
        apiHelper.insertUser(user)


    suspend fun getAll() =
        apiHelper.getAll()
}