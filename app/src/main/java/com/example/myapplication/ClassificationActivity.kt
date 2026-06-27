package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
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

        etClassificationScore.setText("0")

        btnClassificationShow.setOnClickListener {
            checkField()
        }
    }

    private fun checkField() {
        var score = etClassificationScore.text
        if(score.isNullOrEmpty()) {
            Toast.makeText(this,"Nilai tidak boleh kosong", Toast.LENGTH_SHORT).show()
        } else if (score.toString().toInt() > 100) {
            Toast.makeText(this, "Nilai tidak boleh lebih dari 100", Toast.LENGTH_SHORT).show()
        } else {
            doClassification(score.toString().toInt())
        }
    }

    private fun doClassification(nilai: Int) {
        var hasil = ""
        when (nilai) {
            in 0..70 -> hasil = "Hasilnya : Belum Lulus"
            in 71..80 -> hasil = "Hasilnya : Lulus Aja"
            in 81..100 -> hasil = "Hasilnya : Lulus Banget"
            else -> hasil = "Hasilnya : Nilai Error"
        }
        tvClassificationResult.text = hasil
    }
}