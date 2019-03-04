package com.zcf.drawgamejs

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webview.settings.javaScriptEnabled = true
        WebView.setWebContentsDebuggingEnabled(true)

        webview.loadUrl("file:///android_asset/fabricDrawing.html")
    }
}
