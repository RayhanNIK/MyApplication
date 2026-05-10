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

        val btnShareText: Button = findViewById(R.id.btnShareText)
        btnShareText.setOnClickListener(this)

        val btnOpenWeb: Button = findViewById(R.id.btnOpenWeb)
        btnOpenWeb.setOnClickListener(this)
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
            R.id.btnShareText -> {
                val sharedtext = "Ini text yang akan di share"
                val sharedTextIntent = Intent(Intent.ACTION_SEND)
                sharedTextIntent.putExtra(Intent.EXTRA_TEXT,sharedtext)
                sharedTextIntent.type = "text/plain"
                val textIntent = Intent.createChooser(sharedTextIntent,null)
                startActivity(textIntent)
            }
            R.id.btnOpenWeb -> {
                val webPage = "http://www.google.co.id/".toUri()
                val openWebIntent = Intent(Intent.ACTION_VIEW, webPage)
                startActivity(openWebIntent)
            }
        }
    }
}