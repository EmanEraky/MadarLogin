package com.egifix.madarlogin.presenter.module

import android.content.Context
import androidx.room.Room
import com.egifix.madarlogin.data.db.dao.UserDao
import com.egifix.madarlogin.data.db.database.AppDatabase
import com.egifix.madarlogin.data.repo.ApiUserHelper
import com.egifix.madarlogin.data.repo.ApiUserRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object CacheModule {


    @Singleton
    @Provides
    fun provideUserDAO(roomDatabase: AppDatabase): UserDao {
        return roomDatabase.userDao()
    }

    @Singleton
    @Provides
    fun provideBlogDb(@ApplicationContext context: Context): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, AppDatabase.DATABASE_NAME)
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun provideApiOffHelper(apiHelper: ApiUserRepo): ApiUserHelper = apiHelper
}