package com.example.messageapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        register_button.setOnClickListener {
            val email = email_textview.text.toString()
            val password = password_textview.text.toString()

            Log.d("MainActivity", "Email is: " + email)
            Log.d("MainActivity", "Password: $password")
        }

        already_have_account_textview.setOnClickListener {
            Log.d("MainActivity", "Try to show Login Activity")

            // launch the login activity somehow
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
