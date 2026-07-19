package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityIntentMoveBundleBinding

class IntentMoveBundleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityIntentMoveBundleBinding

    companion object {
        const val EXTRA_BUNDLE_AGE = "extra_age"
        const val EXTRA_BUNDLE_NAME = "extra_name"
    }

    private var name: String = ""
    private var age: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentMoveBundleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getIntentExtras()
        showData()
    }

    private fun getIntentExtras() {
        name = intent.extras?.getString(EXTRA_BUNDLE_NAME) ?: ""
        age = intent.extras?.getInt(EXTRA_BUNDLE_AGE, 0) ?: 0
    }

    private fun showData() {
        val text = "Nama : $name, Age : $age"
        binding.tvBundleReceived.text = text
    }
}