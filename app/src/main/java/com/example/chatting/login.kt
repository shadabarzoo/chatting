package com.example.chatting

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class login : AppCompatActivity() {

    lateinit var username : EditText
    lateinit var password : EditText
    lateinit var login: Button
    val validMobileNumber="0123456789"
    val validPassword= arrayOf("Saima","Shadab","Nadeem","Prem","Sunil")

    lateinit var sharedPreferences :SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        sharedPreferences=getSharedPreferences(getString(R.string.preference_file_name),
            MODE_PRIVATE)
        val isLoggedIn = sharedPreferences.getBoolean("isLoggedIn",false)
        setContentView(R.layout.activity_login)

        /*if(isLoggedIn){
            val s= Intent(this@login,Main::class.java)
            startActivity(s)
            finish()
        }*/

        username=findViewById(R.id.username)
        password=findViewById(R.id.password)
        login=findViewById(R.id.login)

        supportActionBar?.hide()

        val login = findViewById<Button>(R.id.login)
        login.setOnClickListener {
            val intent= Intent(this@login,Main::class.java)
            Toast.makeText(applicationContext, "Login Succesfully", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        val forgetpass = findViewById<TextView>(R.id.forget)
        forgetpass.setOnClickListener {
            val forget= Intent(this@login,forget::class.java)
            startActivity(forget)
        }

        val newacc = findViewById<TextView>(R.id.newacc)
        newacc.setOnClickListener {
            val intent= Intent(this@login,register::class.java)
            startActivity(intent)
        }

        login.setOnClickListener {
            val mobileNumber = username.text.toString()
            val password = password.text.toString()
            var nameOfAvenger="Avenger"
            val start=Intent(this@login,Main::class.java)
            if ((mobileNumber == validMobileNumber)) {
                when (password) {
                    validPassword[0] -> {
                        nameOfAvenger = "Saima"
                        savePreferences(nameOfAvenger)
                        startActivity(start)
                    }
                    validPassword[1] -> {
                        nameOfAvenger = "Shadab"
                        savePreferences(nameOfAvenger)
                        startActivity(start)
                    }
                    validPassword[2] -> {
                        nameOfAvenger = "Nadeem"
                        savePreferences(nameOfAvenger)
                        startActivity(start)
                    }
                    validPassword[3] -> {
                        nameOfAvenger = "Prem"
                        savePreferences(nameOfAvenger)
                        startActivity(start)
                    }
                    validPassword[4] -> {
                        nameOfAvenger = "Sunil"
                        savePreferences(nameOfAvenger)
                        startActivity(start)
                    }
                    else -> Toast.makeText(this,"Incorrect Password",Toast.LENGTH_LONG).show()
                }

            } else {

                Toast.makeText(this , "Incorrect Credentials", Toast.LENGTH_LONG).show()

            }

        }

    }
    override fun onPause(){
        super.onPause()
        finish()
    }
    fun savePreferences(title:String){
        sharedPreferences.edit().putBoolean("isLoggedIn",true).apply()
        sharedPreferences.edit().putString("Title",title).apply()
    }
}

