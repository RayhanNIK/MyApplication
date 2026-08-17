package com.example.myapplication.listHero

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class ListHeroAdapter : RecyclerView.Adapter<ListHeroAdapter.ListHeroViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListHeroViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(
        holder: ListHeroViewHolder,
        position: Int
    ) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class ListHeroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivHeroPhoto: ImageView = itemView.findViewById(R.id.ivHeroPhoto)
        val tvHeroName: TextView = itemView.findViewById(R.id.tvHeroName)
        val tvHeroDesc: TextView = itemView.findViewById(R.id.tvHeroDesc)
    }


}