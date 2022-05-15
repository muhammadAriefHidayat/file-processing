package com.apps.fileprocessing

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.apps.fileprocessing.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // apply binding and event
        binding.apply {
            btnPdfHandle.setOnClickListener {
                //set intent
                val intent = Intent(this@MainActivity, PdfHandleActivity::class.java)
                startActivity(intent)
            }

            btnImageHandle.setOnClickListener {
                //set intent
                val intent = Intent(this@MainActivity, ImageHandleActivity::class.java)
                startActivity(intent)
            }

            btnVideoHandle.setOnClickListener {
                //set intent
                val intent = Intent(this@MainActivity, VideoHandleActivity::class.java)
                startActivity(intent)
            }
        }
    }
}