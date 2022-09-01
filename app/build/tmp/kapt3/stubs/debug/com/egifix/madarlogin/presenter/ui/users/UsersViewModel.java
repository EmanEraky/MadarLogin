package com.egifix.madarlogin.presenter.ui.users;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\rR \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/egifix/madarlogin/presenter/ui/users/UsersViewModel;", "Landroidx/lifecycle/ViewModel;", "getUsersUseCase", "Lcom/egifix/madarlogin/domain/useCase/getUsersUseCase;", "(Lcom/egifix/madarlogin/domain/useCase/getUsersUseCase;)V", "_users", "Landroidx/lifecycle/MutableLiveData;", "Lcom/egifix/madarlogin/utils/Resource;", "", "Lcom/egifix/madarlogin/data/db/entities/User;", "allUsers", "getAllUsers", "()Landroidx/lifecycle/MutableLiveData;", "", "app_debug"})
public final class UsersViewModel extends androidx.lifecycle.ViewModel {
    private final com.egifix.madarlogin.domain.useCase.getUsersUseCase getUsersUseCase = null;
    private final androidx.lifecycle.MutableLiveData<com.egifix.madarlogin.utils.Resource<java.util.List<com.egifix.madarlogin.data.db.entities.User>>> _users = null;
    
    @javax.inject.Inject()
    public UsersViewModel(@org.jetbrains.annotations.NotNull()
    com.egifix.madarlogin.domain.useCase.getUsersUseCase getUsersUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.egifix.madarlogin.utils.Resource<java.util.List<com.egifix.madarlogin.data.db.entities.User>>> getAllUsers() {
        return null;
    }
    
    public final void getAllUsers() {
    }
}