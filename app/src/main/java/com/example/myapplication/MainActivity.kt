package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myText: TextView = findViewById(R.id.myText1)
        myText.text = "Goodbye"

        val myButton: Button = findViewById(R.id.myButton1)
        myButton.setOnClickListener(this)
        }

    override fun onClick(v: View?) {
        Toast.makeText(this,"Click", Toast.LENGTH_SHORT).show()
    }
}