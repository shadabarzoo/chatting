package com.example.chatting

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.android.material.snackbar.Snackbar

class forget : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget)

        val dialog = findViewById<Button>(R.id.reset)

        dialog.setOnClickListener {
            val dialog = AlertDialog.Builder(this)
            dialog.setTitle("Alert!!")
            dialog.setMessage("Password sent to your registered Mobile number and Gmail")
            dialog.setIcon(R.mipmap.ic_launcher);
            dialog.setPositiveButton("Ok"){ dialog,id ->
            }
            dialog.show()
        }

    }
}