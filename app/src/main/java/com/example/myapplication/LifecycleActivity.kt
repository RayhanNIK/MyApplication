package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class LifecycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Log Lifecycle", " - - on Create")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Log Lifecycle", " - - on Start")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Log Lifecycle", " - - on Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Log Lifecycle", " - - on Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Log Lifecycle", " - - on Stop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Log Lifecycle", " - - on Restart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Log Lifecycle", " - - on Destroy")
    }
}

