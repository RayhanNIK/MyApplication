package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityIntentMoveObjectBinding

class IntentMoveObjectActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIntentMoveObjectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentMoveObjectBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}