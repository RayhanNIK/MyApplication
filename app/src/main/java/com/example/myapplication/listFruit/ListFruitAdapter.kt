package com.example.myapplication.listFruit

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class ListFruitAdapter: RecyclerView.Adapter<ListFruitAdapter.ListFruitViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListFruitViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(
        holder: ListFruitViewHolder,
        position: Int
    ) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class ListFruitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvFruitName: TextView = itemView.findViewById(R.id.tvFruitName)
    }

}