package com.apps.fileprocessing

import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.apps.fileprocessing.databinding.ActivityWebViewBinding


class WebViewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWebViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            val url = Utils.getPdfUrl()
            // set webview client

            webView.webViewClient = object : WebViewClient() {

                //set visibility  when page finish
                override fun onPageFinished(view: WebView, url: String) {
                    pgLoad.imageLoad.visibility = View.INVISIBLE
                    pgLoad.progressbar.visibility = View.INVISIBLE
                    pgLoad.tv.visibility = View.INVISIBLE

                    webView.visibility = View.VISIBLE
                }
            }
            // set webview support zoom
            webView.settings.setSupportZoom(true)
            // set webview javascript
            webView.settings.javaScriptEnabled = true
            // set webview domstorage
            webView.settings.domStorageEnabled = true
            // set url webview
            webView.loadUrl("https://docs.google.com/gview?embedded=true&url=$url")
        }
    }
}