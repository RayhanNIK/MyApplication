package com.example.myapplication.model

import com.example.myapplication.R

class FruitRepository {
    fun getFruits(): List<Fruit> {
        return listOf(
            Fruit(1, "Apple", "Red", R.drawable.ic_launcher_foreground),
            Fruit(2, "Banana", "Yellow", R.drawable.ic_launcher_foreground),
            Fruit(3, "Grape", "Purple", R.drawable.ic_launcher_foreground)
        )
    }
}