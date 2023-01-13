package com.example.chatting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val login = findViewById<Button>(R.id.register)
        login.setOnClickListener {
            Toast.makeText(applicationContext, "Registered Succesfully", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }


    }
    override fun onPause(){
        super.onPause()
        finish()
    }

}