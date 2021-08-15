package com.kalpsdeveloper.recyclerviewdemo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kalpsdeveloper.recyclerviewdemo.databinding.DemoItemBinding

class DemoViewHolder(private val binding: DemoItemBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: DemoModel) {
        binding.tvDemo.text = item.name
    }

    companion object {
        fun create(parent: ViewGroup) = DemoViewHolder(
            DemoItemBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )

    }
}