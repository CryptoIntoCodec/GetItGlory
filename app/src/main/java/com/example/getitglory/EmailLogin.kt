package com.example.getitglory

import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class EmailLogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.email_login)

        val emailEmailLogin = findViewById<EditText>(R.id.editTextTextEmailAddress)
        val passwordEmailLogin = findViewById<EditText>(R.id.editTextTextPassword)
        val loginEmailLogin = findViewById<Button>(R.id.button)
        val registerEmailLogin = findViewById<Button>(R.id.button2)

        registerEmailLogin.setOnClickListener {
            if (TextUtils.isEmpty(emailEmailLogin.toString())) {
                Toast.makeText(this, "Email is mandatory", Toast.LENGTH_SHORT).show()
            }
            if (TextUtils.isEmpty(passwordEmailLogin.toString())) {
                Toast.makeText(this, "password can't be empty", Toast.LENGTH_SHORT).show()
            }
            else{
                print("user registered")

            }

        }
    }
}