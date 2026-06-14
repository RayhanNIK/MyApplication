package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class VolumeActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var edtLength: EditText
    private lateinit var edtWidth: EditText
    private lateinit var edtHeight: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volume)

        edtLength = findViewById(R.id.edtLength)
        edtWidth = findViewById(R.id.edtWidth)
        edtHeight = findViewById(R.id.edtHeight)
        btnCalculate = findViewById(R.id.btnCalculate)
        tvResult = findViewById(R.id.tvResult)

        btnCalculate.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        if (view.id == R.id.btnCalculate) {

            val length = edtLength.text.toString().trim()
            val width = edtWidth.text.toString().trim()
            val height = edtHeight.text.toString().trim()

            when {
                length.isEmpty() -> edtLength.error = "Empty Field"
                width.isEmpty() -> edtWidth.error = "Empty Field"
                height.isEmpty() -> edtHeight.error = "Empty Field"

                else -> {
                    val volume = length.toDouble() * width.toDouble() * height.toDouble()
                    tvResult.text = volume.toString()
                }

            }

        }
    }
}