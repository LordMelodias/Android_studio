package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val username = intent.getStringExtra("username")
        //val homebtn = findViewById<Button>(R.id.homepg)
        val greetingTextView = findViewById<TextView>(R.id.display)
        greetingTextView.text = "Hello $username!"

        fun onBackPressed() {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("Are you sure")
            builder.setMessage("Do you want to close app")
            builder.setPositiveButton("Yes", { dialogInterface, i -> finishAffinity() })
            builder.setNegativeButton("No", { dialogInterface, i -> })
            builder.show()
        }
    }
}
