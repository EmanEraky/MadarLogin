package com.egifix.madarlogin.presenter.ui.users

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.egifix.madarlogin.R
import com.egifix.madarlogin.databinding.ActivityUsersBinding
import com.egifix.madarlogin.utils.Status
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UsersActivity : AppCompatActivity() {
    lateinit var adapter: UsersAdapter
    lateinit var binding: ActivityUsersBinding
    private val usersViewModel: UsersViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_users)

        adapter = UsersAdapter(emptyList())
        binding.usersAdapter = adapter
        observeUsers()
    }

    private fun observeUsers() {
        usersViewModel.allUsers.observe(this) {
            when (it.status) {
                Status.SUCCESS -> {
                    it.data?.let { user ->
                        adapter.setUsers(user)
                    }
                }
            }
        }
    }
}