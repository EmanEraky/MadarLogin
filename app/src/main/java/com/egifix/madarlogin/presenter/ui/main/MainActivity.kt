package com.egifix.madarlogin.presenter.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.egifix.madarlogin.R
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.egifix.madarlogin.data.db.entities.User
import com.egifix.madarlogin.databinding.ActivityMainBinding
import com.egifix.madarlogin.presenter.ui.users.UsersActivity
import com.egifix.madarlogin.utils.Status
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()
    private var gender = "female"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.btnUsers.setOnClickListener {

            startActivity(Intent(this, UsersActivity::class.java))
        }
        binding.rbFemale.setOnCheckedChangeListener { _, b ->
            if (b)
                gender = "female"
        }
        binding.rbMale.setOnCheckedChangeListener { _, b ->
            if (b)
                gender = "male"
        }


        binding.btnSave.setOnClickListener {
            validateSaveUser()
        }
    }

    private fun validateSaveUser() {
        when {
            binding.etName.text.toString().isEmpty() -> {
                binding.etName.apply {
                    requestFocus()
                    error = "Required filed Name"
                }
            }
            binding.etAge.text.toString().isEmpty() -> {
                binding.etAge.apply {
                    requestFocus()
                    error = "Required Filed Age"
                }
            }
            binding.etTitle.text.toString().isEmpty() -> {
                binding.etTitle.apply {
                    requestFocus()
                    error = "Required Filed Title"
                }
            }
            else -> {
                val user = User(
                    0,
                    binding.etName.text.toString(),
                    binding.etAge.text.toString(),
                    binding.etTitle.text.toString(),
                    gender
                )
                mainViewModel.insertUser(user)
                Toast.makeText(this@MainActivity, "User Data saved", Toast.LENGTH_LONG).show()
            }
        }
    }

}