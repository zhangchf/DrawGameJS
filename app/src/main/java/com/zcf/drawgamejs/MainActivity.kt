package com.zcf.drawgamejs

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        WebView.setWebContentsDebuggingEnabled(true)
        webview.settings.javaScriptEnabled = true
        webview.settings.domStorageEnabled = true
        webview.settings.allowUniversalAccessFromFileURLs = true

        // Method 1:
//        webview.loadUrl("file:///android_asset/fabricDrawing.html")
        // Method 2:
//        webview.loadUrl("http://10.128.59.2:3000")
        // Method 3:
        webview.loadUrl("https://zhangchf-echoserver.glitch.me")
    }
}
