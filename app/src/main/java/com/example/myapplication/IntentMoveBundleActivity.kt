package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityIntentMoveBundleBinding

class IntentMoveBundleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIntentMoveBundleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentMoveBundleBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}