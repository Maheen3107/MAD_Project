package com.example.instagram_clone

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Find the Login button using its ID
        val loginButton: Button = findViewById(R.id.loginButton)
        val signUpText: TextView = findViewById(R.id.signupText)

        // Set an OnClickListener for the Login button
        loginButton.setOnClickListener {
            // Start the HomeActivity when the Login button is clicked
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        // Set an OnClickListener for the Sign Up text
        signUpText.setOnClickListener {
            // Start the SignUpActivity when the Sign Up text is clicked
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }

    // This method is called when the Sign Up text is clicked
    fun onSignUpClick(view: View) {
        // Start the SignUpActivity
        val intent = Intent(this, SignInActivity::class.java)
        startActivity(intent)
    }
}
