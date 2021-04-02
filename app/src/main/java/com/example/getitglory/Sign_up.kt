package com.example.getitglory

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class Sign_up : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth
    val fname = findViewById<EditText>(R.id.Fname)
    val lname = findViewById<EditText>(R.id.Lname)
    val email = findViewById<EditText>(R.id.EmailSign_up)
    val npass = findViewById<EditText>(R.id.Password1)
    val register = findViewById<Button>(R.id.button6)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up)
        val auth = FirebaseAuth.getInstance()

        register.setOnClickListener {
            registerUser()
        }
    }


    public override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = auth.currentUser
        if (currentUser != null) {
            reload();
        }
    }

    private fun updateUI(user: FirebaseUser?) {

    }

    private fun reload() {

    }

    fun registerUser() {
        if (fname.text.toString().isEmpty()) {
            fname.error = "please enter First name"
            fname.requestFocus()
            return
        }
        if (lname.text.toString().isEmpty()) {
            lname.error = "please enter Last name"
            lname.requestFocus()
            return
        }
        if (email.text.toString().isEmpty()) {
            email.error = "please enter Email"
            email.requestFocus()
            return
        }
        if (!Patterns.EMAIL_ADDRESS.matcher(email.text.toString()).matches()) {
            email.error = "please enter valid Email"
            email.requestFocus()
            return
        }
        if (npass.text.toString().isEmpty()) {
            npass.error = "please enter password"
            npass.requestFocus()
            return
        }
        auth.createUserWithEmailAndPassword(email.text.toString(), npass.text.toString())
                .addOnCompleteListener(this) { task ->
                    if (task.isSuccessful) {
                        startActivity(Intent(this, EmailLogin::class.java))
                        finish()
                    } else {
                        Toast.makeText(this, "Sign-up failed, Try again after some time", Toast.LENGTH_SHORT).show()
                    }
                }
    }

}
