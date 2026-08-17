package com.example.myapplication.listHero

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.Hero

class ListHeroAdapter(
    private val listHero: ArrayList<Hero>
) : RecyclerView.Adapter<ListHeroAdapter.ListHeroViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListHeroViewHolder {
        val view: View=
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_list_hero, parent, false)
        return ListHeroViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ListHeroViewHolder,
        position: Int
    ) {
        val (name, description, photo) = listHero[position]
        holder.ivHeroPhoto.setImageResource(photo)
        holder.tvHeroName.text = name
        holder.tvHeroDesc.text = description
    }

    override fun getItemCount(): Int = listHero.size

    class ListHeroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivHeroPhoto: ImageView = itemView.findViewById(R.id.ivHeroPhoto)
        val tvHeroName: TextView = itemView.findViewById(R.id.tvHeroName)
        val tvHeroDesc: TextView = itemView.findViewById(R.id.tvHeroDesc)
    }


}