package com.example.chatting

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)

        supportActionBar?.hide()

         Handler().postDelayed({
            val startAct = Intent(this@splashscreen, login::class.java)
            startActivity(startAct)
        },2000)
    }
    override fun onPause() {
        super.onPause()
        finish()
    }
}