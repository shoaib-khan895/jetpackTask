package com.example.jetpack.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.jetpack.PersonDataClass
import com.example.jetpack.R
import com.example.jetpack.databinding.ItemPersonViewBinding

class PersonDetailAdapter(
    private val personsDataset: ArrayList<PersonDataClass>
): RecyclerView.Adapter<PersonDetailAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemPersonViewBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = DataBindingUtil.inflate<ItemPersonViewBinding>(
            inflater,
            R.layout.item_person_view,
            parent,
            false
        )
        return ViewHolder(binding)
    }
    override fun getItemCount(): Int = personsDataset.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.person = personsDataset[position]
    }
}