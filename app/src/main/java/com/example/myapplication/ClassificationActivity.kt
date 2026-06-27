package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ClassificationActivity : AppCompatActivity() {

    private lateinit var etClassificationScore: EditText
    private lateinit var btnClassificationShow: Button
    private lateinit var tvClassificationResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_classification)

        etClassificationScore = findViewById(R.id.etClassificationScore)
        btnClassificationShow = findViewById(R.id.btnClassificationShow)
        tvClassificationResult = findViewById(R.id.tvClassificationResult)
    }
}