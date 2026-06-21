package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ConstaintActivity : AppCompatActivity() {

    private lateinit var etLoginUsername: EditText
    private lateinit var etLoginPassword: EditText
    private lateinit var tvLoginStatus: TextView
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constaint)

        etLoginUsername = findViewById(R.id.etLoginUsername)
        etLoginPassword = findViewById(R.id.etLoginPassword)
        tvLoginStatus = findViewById(R.id.tvLoginStatus)
        btnLogin = findViewById(R.id.btnLogin)

        btnLogin.setOnClickListener {

        }
    }
}