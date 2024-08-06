package com.example.demoinsect

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {

    private lateinit var imageView: ImageView
    private lateinit var titleTextView: TextView
    private lateinit var realTimeButton: Button
    private lateinit var uploadButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        imageView = findViewById(R.id.imageview)
        titleTextView = findViewById(R.id.title)
        realTimeButton = findViewById(R.id.RealTime)
        uploadButton = findViewById(R.id.Upload)

        // Load image into ImageView using Glide
        Glide.with(this)
            .load("https://demo.roboflow.com/cotton-insect-detection/2?publishable_key=rf_fGMOBTlhVCPYuLWW9jaGuTrPATs2")
            .into(imageView)

        // Set up button click listeners
        realTimeButton.setOnClickListener {
            // Open a URL in a browser when Real Time button is clicked
            val url = "https://demo.roboflow.com/cotton-insect-detection/2?publishable_key=rf_fGMOBTlhVCPYuLWW9jaGuTrPATs2"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        uploadButton.setOnClickListener {
            // Handle Upload button click
            // Implement functionality here
        }
    }
}
