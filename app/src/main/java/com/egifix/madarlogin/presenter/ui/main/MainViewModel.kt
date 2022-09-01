package com.egifix.madarlogin.presenter.ui.main

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
class MainViewModel @Inject constructor(private val getUsersUseCase: getUsersUseCase) :
    ViewModel() {

    private val _userInsert = MutableLiveData<Resource<Long>>()



    fun insertUser(user: User) {
        viewModelScope.launch {
            _userInsert.postValue(Resource.loading(null))
            getUsersUseCase.insertUser(user).collect {
                _userInsert.postValue(it)
            }

        }
    }


}