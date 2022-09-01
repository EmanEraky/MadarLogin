package com.egifix.madarlogin.data.db.database;

import java.lang.System;

@androidx.room.Database(entities = {com.egifix.madarlogin.data.db.entities.User.class}, version = 2)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/egifix/madarlogin/data/db/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "userDao", "Lcom/egifix/madarlogin/data/db/dao/UserDao;", "Companion", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.egifix.madarlogin.data.db.database.AppDatabase.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DATABASE_NAME = "general_database";
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.egifix.madarlogin.data.db.dao.UserDao userDao();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/egifix/madarlogin/data/db/database/AppDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "getDATABASE_NAME", "()Ljava/lang/String;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDATABASE_NAME() {
            return null;
        }
    }
}