package com.example.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView()


    }
    private fun webView(){
        val webview = findViewById<WebView>(R.id.wb_view)
        webview.webViewClient = WebViewClient()
        webview.apply {
            loadUrl("https://swiddowson.mccweb.net/hangman3/")
            settings.javaScriptEnabled = true
        }
    }

    override fun onBackPressed() {
        val webview = findViewById<WebView>(R.id.wb_view)
        if (webview.canGoBack()) webview.goBack() else super.onBackPressed()
    }
}