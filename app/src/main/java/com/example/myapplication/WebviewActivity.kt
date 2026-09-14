package com.example.myapplication

import android.os.Bundle
import android.webkit.JsResult
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class WebviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_webview)

        val webView = findViewById<WebView>(R.id.webView)
        webView.settings.javaScriptEnabled = true

        webView.webViewClient = object : WebViewClient() {
            override fun onPageFinished(view: WebView, url: String) {
                /**Toast.makeText(this@WebviewActivity,
                    "Web Dicoding berhasil dimuat",
                    Toast.LENGTH_SHORT).show()**/

                view.loadUrl("javascript:alert('Web Dicoding berhasil dimuat')")
            }
        }

        webView.webChromeClient = object : WebChromeClient() {
            override fun onJsAlert(
                view: WebView,
                url: String,
                message: String,
                result: JsResult
            ): Boolean {
                /**Toast.makeText(this@WebviewActivity,
                    message,
                    Toast.LENGTH_SHORT).show()**/
                AlertDialog.Builder(this@WebviewActivity)
                    .setTitle("Alert")
                    .setMessage(message)
                    .setPositiveButton(android.R.string.ok) { _,_ ->
                        Toast.makeText(this@WebviewActivity,
                            message, Toast.LENGTH_LONG).show()
                        result.confirm()
                    }
                    .setCancelable(false)
                    .create()
                    .show()
                return true
            }
        }
        //webView.webChromeClient = WebChromeClient()
        webView.loadUrl("https://www.dicoding.com")
    }
}