package com.example.myapplication.listFruit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.Fruit

class ListFruitAdapter(
    private val itemList: List<Fruit>
) : RecyclerView.Adapter<ListFruitAdapter.ListFruitViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListFruitViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list_fruit, parent, false)
        return ListFruitViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ListFruitViewHolder,
        position: Int
    ) {
        val item = itemList[position]
        holder.tvFruitName.text = item.name
    }

    override fun getItemCount(): Int = itemList.size

    class ListFruitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvFruitName: TextView = itemView.findViewById(R.id.tvFruitName)
    }
}