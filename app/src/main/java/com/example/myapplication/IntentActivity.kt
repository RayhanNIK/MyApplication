package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri

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
                val latitude = "47.6"
                val longitude = "-122.3"
                val showMap = "geo:$latitude,$longitude".toUri()
                val showMapIntent = Intent(Intent.ACTION_VIEW, showMap)
                startActivity(showMapIntent)
            }

            R.id.btnTelephone -> {
                val phoneNumber = "0812346789"
                val dialphoneIntent = Intent(Intent.ACTION_DIAL, "tel:$phoneNumber".toUri())
                startActivity(dialphoneIntent)
            }
            R.id.btnMessage -> {
                val phoneNumber = "08123456789"
                val sendSMS = "smsto:$phoneNumber".toUri()
                val message = "Halo, ini Rere"
                val sendsmsIntent = Intent(Intent.ACTION_SENDTO, sendSMS)
                sendsmsIntent.putExtra("sms_body", message)
                startActivity(sendsmsIntent)
            }
        }
    }
}


