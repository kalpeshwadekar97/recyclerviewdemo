package com.kalpsdeveloper.recyclerviewdemo

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DemoAdapter : RecyclerView.Adapter<DemoViewHolder>() {

    var list: List<DemoModel> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DemoViewHolder =
        DemoViewHolder.create(parent)

    override fun onBindViewHolder(holder: DemoViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}