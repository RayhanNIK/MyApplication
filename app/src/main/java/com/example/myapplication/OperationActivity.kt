package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class OperationActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etBilanganX: EditText
    private lateinit var etBilanganY: EditText
    private lateinit var tvOperator: TextView
    private lateinit var tvOperationResult: TextView
    private lateinit var btnOpAdd: Button
    private lateinit var btnOpSubstract: Button
    private lateinit var btnOpMultiply: Button
    private lateinit var btnOpDivide: Button
    private lateinit var btnOpReset: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_operation)

        etBilanganX = findViewById(R.id.etBilanganX)
        etBilanganY = findViewById(R.id.etBilanganY)
        tvOperator = findViewById(R.id.tvOperator)
        tvOperationResult = findViewById(R.id.tvOperationResult)
        btnOpAdd = findViewById(R.id.btnOpAdd)
        btnOpSubstract = findViewById(R.id.btnOpSubstract)
        btnOpMultiply = findViewById(R.id.btnOpMultiply)
        btnOpDivide = findViewById(R.id.btnOpDivide)
        btnOpReset = findViewById(R.id.btnOpReset)

        btnOpAdd.setOnClickListener(this)
        btnOpSubstract.setOnClickListener(this)
        btnOpMultiply.setOnClickListener(this)
        btnOpDivide.setOnClickListener(this)
        btnOpReset.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when(view.id) {
            R.id.btnOpAdd -> {

            }
            R.id.btnOpSubstract -> {

            }
            R.id.btnOpMultiply -> {

            }
            R.id.btnOpDivide -> {

            }
            R.id.btnOpReset -> {

            }
        }
    }
}