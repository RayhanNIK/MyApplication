package com.example.myapplication

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityOperationBinding

class OperationActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityOperationBinding
    private var inputX: Long = 0
    private var inputY: Long = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOperationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOpAdd.setOnClickListener(this)
        binding.btnOpSubstract.setOnClickListener(this)
        binding.btnOpMultiply.setOnClickListener(this)
        binding.btnOpDivide.setOnClickListener(this)
        binding.btnOpReset.setOnClickListener(this)
    }

    private fun getInputNumbers() {
        if (binding.etBilanganX.text?.isNotEmpty() == true || binding.etBilanganY.text?.isNotEmpty() == true) {
            inputX = binding.etBilanganX.text.toString().toLong()
            inputY = binding.etBilanganY.text.toString().toLong()
        }
    }

    override fun onClick(view: View) {
        when(view.id) {
            R.id.btnOpAdd -> {
                binding.tvOperator.text = resources.getString(R.string.operation_add)
                getInputNumbers()
                val operation = inputX + inputY
                binding.tvOperationResult.text = operation.toString()
            }
            R.id.btnOpSubstract -> {
                binding.tvOperator.text = resources.getString(R.string.operation_substract)
                getInputNumbers()
                val operation = inputX - inputY
                binding.tvOperationResult.text = operation.toString()
            }
            R.id.btnOpMultiply -> {
                binding.tvOperator.text = resources.getString(R.string.operation_multiply)
                getInputNumbers()
                val operation = inputX * inputY
                binding.tvOperationResult.text = operation.toString()
            }
            R.id.btnOpDivide -> {
                binding.tvOperator.text = resources.getString(R.string.operation_divide)
                getInputNumbers()
                val operation = inputX / inputY
                binding.tvOperationResult.text = operation.toString()
            }
            R.id.btnOpReset -> {
                binding.etBilanganX.setText("0")
                binding.etBilanganY.setText("0")
                binding.tvOperator.text = ""
                binding.tvOperationResult.text = "0"
            }
        }
    }
}