package com.example.appbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val searchButton: ImageButton = findViewById(R.id.search_button)
        val fileButton: ImageButton = findViewById(R.id.file_button)

        searchButton.setOnClickListener {
            Toast.makeText(this@MainActivity, "Search button clicked", Toast.LENGTH_SHORT).show()
        }

        fileButton.setOnClickListener {
            Toast.makeText(this@MainActivity, "File button clicked", Toast.LENGTH_SHORT).show()
        }

    }
}

