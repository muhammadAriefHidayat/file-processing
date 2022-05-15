package com.apps.fileprocessing

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.apps.fileprocessing.databinding.ActivityPdfHandleBinding

class   PdfHandleActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPdfHandleBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPdfHandleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // apply binding and event
        binding.apply {
            buttonWebView.setOnClickListener {
                val intent = Intent(this@PdfHandleActivity, WebViewActivity::class.java)
                startActivity(intent)
            }

            buttonAssets.setOnClickListener {
                val intent = Intent(this@PdfHandleActivity, PdfViewActivity::class.java)
                intent.putExtra("ViewType", "assets")
                startActivity(intent)
            }

            buttonStorage.setOnClickListener {
                val intent = Intent(this@PdfHandleActivity, PdfViewActivity::class.java)
                intent.putExtra("ViewType", "storage")
                startActivity(intent)
            }

            buttonInternet.setOnClickListener {
                val intent = Intent(this@PdfHandleActivity, PdfViewActivity::class.java)
                intent.putExtra("ViewType", "internet")
                startActivity(intent)
            }
        }
    }
}