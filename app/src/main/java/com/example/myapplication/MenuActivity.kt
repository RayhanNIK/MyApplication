package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        val btnLifecycle: Button = findViewById(R.id.btnLifecycle)
        btnLifecycle.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        Log.d("Log intent", "Intent")
        val lifecycleIntent = Intent(this@MenuActivity, LifecycleActivity::class.java)
        startActivity(lifecycleIntent)
    }
}