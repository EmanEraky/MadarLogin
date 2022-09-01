package com.egifix.madarlogin.presenter.ui.users

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.egifix.madarlogin.data.db.entities.User
import com.egifix.madarlogin.domain.useCase.getUsersUseCase
import com.egifix.madarlogin.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class UsersViewModel @Inject constructor(private val getUsersUseCase: getUsersUseCase) :
    ViewModel() {

    private val _users = MutableLiveData<Resource<List<User>>>()
    val allUsers: MutableLiveData<Resource<List<User>>>
        get() = _users

    init {
        getAllUsers()
    }
    fun getAllUsers() {
        viewModelScope.launch {
            _users.postValue(Resource.loading(null))
            getUsersUseCase.getAll().collect {
                _users.postValue(it)
            }

        }
    }


}