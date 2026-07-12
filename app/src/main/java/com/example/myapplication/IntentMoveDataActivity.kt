package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityIntentMoveDataBinding

class IntentMoveDataActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIntentMoveDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentMoveDataBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}