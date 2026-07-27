package com.example.myapplication

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityIntentMoveResultBinding

class IntentMoveResultActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityIntentMoveResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntentMoveResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnResultChoose.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view == binding.btnResultChoose) {

        }
    }
}
