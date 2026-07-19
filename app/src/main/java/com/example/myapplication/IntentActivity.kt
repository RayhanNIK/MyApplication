package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import com.example.myapplication.model.Person

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

        val btnShareText: Button = findViewById(R.id.btnShareText)
        btnShareText.setOnClickListener(this)

        val btnOpenWeb: Button = findViewById(R.id.btnOpenWeb)
        btnOpenWeb.setOnClickListener(this)

        val btnIntentMoveData: Button = findViewById(R.id.btnIntentMoveData)
        btnIntentMoveData.setOnClickListener(this)

        val btnIntentMoveObject: Button = findViewById(R.id.btnIntentMoveObject)
        btnIntentMoveObject.setOnClickListener(this)

        val btnIntentMoveBundle: Button = findViewById(R.id.btnIntentMoveBundle)
        btnIntentMoveBundle.setOnClickListener(this)
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
            R.id.btnShareText -> {
                val sharedtext = "Ini text yang akan di share"
                val sharedTextIntent = Intent(Intent.ACTION_SEND)
                sharedTextIntent.putExtra(Intent.EXTRA_TEXT,sharedtext)
                sharedTextIntent.type = "text/plain"
                val textIntent = Intent.createChooser(sharedTextIntent,null)
                startActivity(textIntent)
            }
            R.id.btnOpenWeb -> {
                val webPage = "http://www.google.co.id/".toUri()
                val openWebIntent = Intent(Intent.ACTION_VIEW, webPage)
                startActivity(openWebIntent)
            }
            R.id.btnIntentMoveData -> {
                val intentMoveData = Intent(this@IntentActivity, IntentMoveDataActivity::class.java)
                intentMoveData.putExtra(IntentMoveDataActivity.EXTRA_NAME, "Rere")
                intentMoveData.putExtra(IntentMoveDataActivity.EXTRA_AGE, 18)
                startActivity(intentMoveData)
            }
            R.id.btnIntentMoveObject -> {
                val person = Person(
                    "Rere",
                    18,
                    "mail@gmail.com",
                    "Jogja"
                )
                val intentMoveObject = Intent(this@IntentActivity, IntentMoveObjectActivity::class.java)
                intentMoveObject.putExtra(IntentMoveObjectActivity.EXTRA_PERSON, person)
                startActivity(intentMoveObject)
            }
            R.id.btnIntentMoveBundle -> {
                val intentMoveBundle = Intent(this@IntentActivity, IntentMoveBundleActivity::class.java)
                startActivity(intentMoveBundle)
            }
        }
    }
}


