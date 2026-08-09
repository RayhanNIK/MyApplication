package com.example.myapplication.listFruit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.FruitRepository

class ListFruitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_fruit)

        val repository = FruitRepository()
        val fruitList = repository.getFruits()

        val recyclerView = findViewById<RecyclerView>(R.id.rvListFruit)
        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = ListFruitAdapter(fruitList)
    }
}