package com.egifix.madarlogin.presenter.ui.main;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/egifix/madarlogin/presenter/ui/main/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "getUsersUseCase", "Lcom/egifix/madarlogin/domain/useCase/getUsersUseCase;", "(Lcom/egifix/madarlogin/domain/useCase/getUsersUseCase;)V", "_userInsert", "Landroidx/lifecycle/MutableLiveData;", "Lcom/egifix/madarlogin/utils/Resource;", "", "userInsert", "getUserInsert", "()Landroidx/lifecycle/MutableLiveData;", "insertUser", "", "user", "Lcom/egifix/madarlogin/data/db/entities/User;", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.egifix.madarlogin.domain.useCase.getUsersUseCase getUsersUseCase = null;
    private final androidx.lifecycle.MutableLiveData<com.egifix.madarlogin.utils.Resource<java.lang.Long>> _userInsert = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.egifix.madarlogin.domain.useCase.getUsersUseCase getUsersUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.egifix.madarlogin.utils.Resource<java.lang.Long>> getUserInsert() {
        return null;
    }
    
    public final void insertUser(@org.jetbrains.annotations.NotNull()
    com.egifix.madarlogin.data.db.entities.User user) {
    }
}