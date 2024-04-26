package com.example.practical_1_menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menuobj: Menu?): Boolean {
        menuInflater.inflate(R.menu.menufile,menuobj)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId)
        {

            R.id.setting ->{
                Toast.makeText(this,"Setting is selected", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.search ->{
                Toast.makeText(this, "Search the items", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.mail ->{
                Toast.makeText(this, "Mail Box", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.feedback ->{
                Toast.makeText(this, "Feedback", Toast.LENGTH_SHORT).show()
                return true
            }

            R.id.composed->{
                Toast.makeText(this, "Composed Mail", Toast.LENGTH_SHORT).show()
                return true
            }

            else -> {throw IllegalStateException("Unexpected value: ${item.itemId}")}
        }
    }
}