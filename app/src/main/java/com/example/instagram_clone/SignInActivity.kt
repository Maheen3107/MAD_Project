package com.example.instagram_clone

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {

    val binding  by lazy {

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        // Find the Sign In button using its ID
        val signInButton: Button = findViewById(R.id.signinButton)

        // Set an OnClickListener for the Sign In button
        signInButton.setOnClickListener {
            // Start the HomeActivity when the Sign In button is clicked
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        // Find the Login text view using its ID
        val loginText: TextView = findViewById(R.id.alreadyHaveAccountText)

        // Set an OnClickListener for the Login text
        loginText.setOnClickListener {
            // Start the LoginActivity when the Login text is clicked
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
