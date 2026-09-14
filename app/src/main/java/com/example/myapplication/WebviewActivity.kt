package com.example.myapplication

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class WebviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)

        val webView = findViewById<WebView>(R.id.webView)
        webView.settings.javaScriptEnabled = true

        webView.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView?, url: String?) {
                Toast.makeText(this@WebviewActivity,
                    "Web Dicoding berhasil dimuat",
                    Toast.LENGTH_SHORT).show()
            }
        }
        webView.loadUrl("https://www.dicoding.com")
    }
}