package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class IntentActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        val btnMap: Button = findViewById(R.id.btnMap)
        btnMap.setOnClickListener(this)

        val btnTelephone: Button = findViewById(R.id.btnTelephone)
        btnTelephone.setOnClickListener(this)

        val btnMessage: Button = findViewById(R.id.btnMessage)
        btnMessage.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.btnMap -> {
                Toast.makeText(this, "Button map diklik", Toast.LENGTH_SHORT).show()
            }

            R.id.btnTelephone -> {
                Toast.makeText(this, "Button telephone diklik", Toast.LENGTH_SHORT).show()
            }
        }
    }
}


