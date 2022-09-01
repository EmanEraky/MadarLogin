package com.egifix.madarlogin.presenter.ui.users

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.egifix.madarlogin.R
import com.egifix.madarlogin.databinding.ItemUserBinding
import com.egifix.madarlogin.data.db.entities.User

class UsersAdapter(private var items: List<User>) :
    RecyclerView.Adapter<UsersAdapter.DataViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val binding = DataBindingUtil.inflate<ItemUserBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_user,
            parent,
            false
        )
        return DataViewHolder(binding)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.binding.user = items[position]
    }


    class DataViewHolder(val binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root)

    fun setUsers(users: List<User>) {
        items = users
        notifyDataSetChanged()
    }
}