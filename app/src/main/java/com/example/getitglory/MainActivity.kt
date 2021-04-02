package com.example.getitglory

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pbutton = findViewById<Button>(R.id.PhoneLogin)
        pbutton.setOnClickListener {
            val intent=Intent(this,PhoneLogin::class.java)
            startActivity(intent)
        }
        val ebutton = findViewById<Button>(R.id.EmailLogin)
        ebutton.setOnClickListener {
            val intent=Intent(this,EmailLogin::class.java)
            startActivity(intent)
        }
        val gbutton = findViewById<Button>(R.id.GoogleLogin)
        gbutton.setOnClickListener {
            val intent=Intent(this,GmailLogin::class.java)
            startActivity(intent)
        }
        val signUpbutton = findViewById<Button>(R.id.signUpButton)
        signUpbutton.setOnClickListener {
            val intent=Intent(this,Sign_up::class.java)
            startActivity(intent)        }
    }
}
