package com.egifix.madarlogin.presenter.module;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/egifix/madarlogin/presenter/module/CacheModule;", "", "()V", "provideApiOffHelper", "Lcom/egifix/madarlogin/data/repo/ApiUserHelper;", "apiHelper", "Lcom/egifix/madarlogin/data/repo/ApiUserRepo;", "provideBlogDb", "Lcom/egifix/madarlogin/data/db/database/AppDatabase;", "context", "Landroid/content/Context;", "provideUserDAO", "Lcom/egifix/madarlogin/data/db/dao/UserDao;", "roomDatabase", "app_debug"})
@dagger.Module()
public final class CacheModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.egifix.madarlogin.presenter.module.CacheModule INSTANCE = null;
    
    private CacheModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.egifix.madarlogin.data.db.dao.UserDao provideUserDAO(@org.jetbrains.annotations.NotNull()
    com.egifix.madarlogin.data.db.database.AppDatabase roomDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.egifix.madarlogin.data.db.database.AppDatabase provideBlogDb(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.egifix.madarlogin.data.repo.ApiUserHelper provideApiOffHelper(@org.jetbrains.annotations.NotNull()
    com.egifix.madarlogin.data.repo.ApiUserRepo apiHelper) {
        return null;
    }
}