package com.example.a10games

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.ArrayAdapter
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animals =
            arrayOf("Lion", "Tiger", "Elephant", "Fox", "Wolf", "Cat", "Dog", "Monkey", "Donkey")

        val mlist = findViewById<ListView>(R.id.animal)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, animals)
        mlist.adapter = adapter

        mlist.setOnItemClickListener { parent, view, position, id ->
            val selectedItem = animals[position]
            Toast.makeText(this, "You clicked on $selectedItem", Toast.LENGTH_SHORT).show()
        }

    }
}
