package com.egifix.madarlogin.data.repo

import com.egifix.madarlogin.data.db.dao.UserDao
import com.egifix.madarlogin.data.db.entities.User
import com.egifix.madarlogin.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class ApiUserRepo @Inject constructor(private val userDao: UserDao) : ApiUserHelper {


    override suspend fun getAll(): Flow<Resource<List<User>>> {
        return flow {
            emit(Resource.loading(null))
            val resource = try {
                val user = userDao.getAll()
                Resource.success(user)
            } catch (e: Throwable) {
                Resource.error(e.toString(), null)
            }
            emit(resource)
        }
    }

    override suspend fun insertUser(user: User): Flow<Resource<Long>> {
        return flow {
            emit(Resource.loading(null))
            val resource = try {
                val _user = userDao.insert(user)
                Resource.success(_user)
            } catch (e: Throwable) {
                Resource.error(e.toString(), null)
            }
            emit(resource)
        }
    }


}