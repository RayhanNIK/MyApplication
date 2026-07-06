package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHello.setOnClickListener(this)
        binding.btnLifecycle.setOnClickListener(this)
        binding.btnIntent.setOnClickListener(this)
        binding.btnLayout.setOnClickListener(this)
        binding.btnConstraint.setOnClickListener(this)
        binding.btnVolume.setOnClickListener(this)
        binding.btnOperation.setOnClickListener(this)
        binding.btnClassification.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view) {
            binding.btnHello -> {
                Log.d("Log intent", "Intent Hello")
                val helloIntent = Intent(this@MenuActivity, MainActivity::class.java)
                startActivity(helloIntent)
            }
            binding.btnLifecycle -> {
                Log.d("Log intent", "Intent")
                val lifecycleIntent = Intent(this@MenuActivity, LifecycleActivity::class.java)
                startActivity(lifecycleIntent)
            }
            binding.btnIntent -> {
                val intentIntent = Intent(this@MenuActivity, IntentActivity::class.java)
                startActivity(intentIntent)
            }
            binding.btnLayout -> {
                val layoutIntent = Intent(this@MenuActivity, LayoutActivity::class.java)
                startActivity(layoutIntent)
            }
            binding.btnConstraint -> {
                val constraintIntent = Intent(this@MenuActivity, ConstaintActivity::class.java)
                startActivity(constraintIntent)
            }
            binding.btnVolume -> {
                val volumetIntent = Intent(this@MenuActivity, VolumeActivity::class.java)
                startActivity(volumetIntent)
            }
            binding.btnOperation -> {
                val operationIntent = Intent(this@MenuActivity, OperationActivity::class.java)
                startActivity(operationIntent)
            }
            binding.btnClassification -> {
                val classificationIntent = Intent(this@MenuActivity, ClassificationActivity::class.java)
                startActivity(classificationIntent)
            }
        }
    }
}