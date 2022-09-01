package com.egifix.madarlogin.domain.useCase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ%\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u00062\u0006\u0010\r\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/egifix/madarlogin/domain/useCase/getUsersUseCase;", "", "apiHelper", "Lcom/egifix/madarlogin/data/repo/ApiUserHelper;", "(Lcom/egifix/madarlogin/data/repo/ApiUserHelper;)V", "getAll", "Lkotlinx/coroutines/flow/Flow;", "Lcom/egifix/madarlogin/utils/Resource;", "", "Lcom/egifix/madarlogin/data/db/entities/User;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertUser", "", "user", "(Lcom/egifix/madarlogin/data/db/entities/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class getUsersUseCase {
    private final com.egifix.madarlogin.data.repo.ApiUserHelper apiHelper = null;
    
    @javax.inject.Inject()
    public getUsersUseCase(@org.jetbrains.annotations.NotNull()
    com.egifix.madarlogin.data.repo.ApiUserHelper apiHelper) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertUser(@org.jetbrains.annotations.NotNull()
    com.egifix.madarlogin.data.db.entities.User user, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.egifix.madarlogin.utils.Resource<java.lang.Long>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAll(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.egifix.madarlogin.utils.Resource<? extends java.util.List<com.egifix.madarlogin.data.db.entities.User>>>> continuation) {
        return null;
    }
}