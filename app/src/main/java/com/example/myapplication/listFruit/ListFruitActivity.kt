package com.example.myapplication.listFruit

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.databinding.ActivityListFruitBinding
import com.example.myapplication.model.FruitRepository

class ListFruitActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListFruitBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListFruitBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val repository = FruitRepository()
        val fruitList = repository.getFruits()

        binding.rvListFruit.layoutManager = LinearLayoutManager(this)

        binding.rvListFruit.adapter = ListFruitAdapter(fruitList)
    }
}