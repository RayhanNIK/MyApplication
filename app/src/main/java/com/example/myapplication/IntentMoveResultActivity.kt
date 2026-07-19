package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityIntentMoveResultBinding

class IntentMoveResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIntentMoveResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentMoveResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}