package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri

class MenuActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnHello: Button = findViewById(R.id.btnHello)
        btnHello.setOnClickListener(this)

        val btnLifecycle: Button = findViewById(R.id.btnLifecycle)
        btnLifecycle.setOnClickListener(this)

        val btnIntent: Button = findViewById(R.id.btnIntent)
        btnIntent.setOnClickListener(this)

        val btnLayout: Button = findViewById(R.id.btnLayout)
        btnLayout.setOnClickListener(this)

        val btnConstraint: Button = findViewById(R.id.btnConstraint)
        btnConstraint.setOnClickListener(this)

        val btnVolume: Button = findViewById(R.id.btnVolume)
        btnVolume.setOnClickListener(this)

        val btnOperation: Button = findViewById(R.id.btnOperation)
        btnOperation.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.btnHello -> {
                Log.d("Log intent", "Intent Hello")
                val helloIntent = Intent(this@MenuActivity, MainActivity::class.java)
                startActivity(helloIntent)
            }
            R.id.btnLifecycle -> {
                Log.d("Log intent", "Intent")
                val lifecycleIntent = Intent(this@MenuActivity, LifecycleActivity::class.java)
                startActivity(lifecycleIntent)
            }
            R.id.btnIntent -> {
                val intentIntent = Intent(this@MenuActivity, IntentActivity::class.java)
                startActivity(intentIntent)
            }
            R.id.btnLayout -> {
                val layoutIntent = Intent(this@MenuActivity, LayoutActivity::class.java)
                startActivity(layoutIntent)
            }
            R.id.btnConstraint -> {
                val constraintIntent = Intent(this@MenuActivity, ConstaintActivity::class.java)
                startActivity(constraintIntent)
            }
            R.id.btnVolume -> {
                val volumetIntent = Intent(this@MenuActivity, VolumeActivity::class.java)
                startActivity(volumetIntent)
            }
            R.id.btnOperation -> {
                val operationIntent = Intent(this@MenuActivity, OperationActivity::class.java)
                startActivity(operationIntent)
            }
        }
    }
}