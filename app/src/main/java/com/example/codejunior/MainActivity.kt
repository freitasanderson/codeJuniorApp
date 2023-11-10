package com.example.codejunior

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.example.codejunior.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val webView = binding.cecaneTO

        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://codejunior.fly.dev/codejunior")
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true

    }

    override fun onBackPressed() {
        val webView = binding.cecaneTO

        if(webView.canGoBack()){
            webView.goBack()
        }
        else{
            super.onBackPressed()
        }
    }
}