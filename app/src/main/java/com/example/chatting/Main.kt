package com.example.chatting

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.Toast

class  Main : AppCompatActivity() {
    var titleName: String? = "Avengers"
    lateinit var sharedPreferences: SharedPreferences
    lateinit var logout: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences = getSharedPreferences(
            getString(R.string.preference_file_name),
            MODE_PRIVATE
        )

        setContentView(R.layout.activity_main)

        titleName = sharedPreferences.getString("Title", "Chatting")

        title = titleName

        val logout = findViewById<Button>(R.id.logout)
        logout.setOnClickListener {
            val intent= Intent(this@Main,login::class.java)
            Toast.makeText(applicationContext, "Logout Succesfully", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

    }
}