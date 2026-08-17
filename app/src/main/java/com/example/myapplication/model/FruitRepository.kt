package com.example.myapplication.model

import com.example.myapplication.R

class FruitRepository {
    fun getFruits(): List<Fruit> {
        return listOf(
            Fruit(1, "Apple", "Red", R.drawable.ic_launcher_foreground),
            Fruit(2, "Banana", "Yellow", R.drawable.ic_launcher_foreground),
            Fruit(3, "Grape", "Purple", R.drawable.ic_launcher_foreground),
            Fruit(4, "Mango", "Green", R.drawable.ic_launcher_foreground),
            Fruit(5, "Orange", "Orange", R.drawable.ic_launcher_foreground),
            Fruit(6, "Peach", "Peach", R.drawable.ic_launcher_foreground),
            Fruit(7, "Blueberry", "Blue", R.drawable.ic_launcher_foreground),
            Fruit(8, "Blackberry", "Black", R.drawable.ic_launcher_foreground),
            Fruit(9, "Strawberry", "Red", R.drawable.ic_launcher_foreground),
            Fruit(10, "Plum", "Purple", R.drawable.ic_launcher_foreground),
            Fruit(11, "Avocado", "Green", R.drawable.ic_launcher_foreground),
            Fruit(12, "Pineapple", "Yellow", R.drawable.ic_launcher_foreground),
            Fruit(13, "Watermelon", "Red", R.drawable.ic_launcher_foreground),
            Fruit(14, "Papaya", "Orange", R.drawable.ic_launcher_foreground),
            Fruit(15, "Kiwi", "Green", R.drawable.ic_launcher_foreground)
        )
    }
}