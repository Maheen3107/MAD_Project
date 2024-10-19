package com.example.instagram_clone

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
class SearchActivity : AppCompatActivity() {

    private lateinit var searchEditText: EditText
    private lateinit var homeIcon: ImageView
    private lateinit var searchIcon: ImageView
    private lateinit var reelIcon: ImageView
    private lateinit var profileIcon: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        // Initialize views with correct IDs
        searchEditText = findViewById(R.id.searchEditText)  // Correct ID: searchEditText
        homeIcon = findViewById(R.id.homeIcon)              // Correct ID: homeIcon
        searchIcon = findViewById(R.id.searchIcon)              // Correct ID: search
        reelIcon = findViewById(R.id.reelIcon)              // Correct ID: reelIcon
        profileIcon = findViewById(R.id.profileIcon)        // Correct ID: profileIcon

        // Add a text listener to filter results as the user types
        searchEditText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                // Implement search functionality here (e.g., filtering users or content)
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                // Handle the search results update based on the text input
            }
        })

        // Footer navigation
        homeIcon.setOnClickListener {
            // Navigate to HomeActivity
            val intent = Intent(this, HomeActivity::class.java)
            // Prevent multiple instances of HomeActivity
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }

        searchIcon.setOnClickListener {
            // No action needed since we're already in SearchActivity
        }

        reelIcon.setOnClickListener {
            // Navigate to ReelActivity if implemented
            // val intent = Intent(this, ReelActivity::class.java)
            // startActivity(intent)
        }

        profileIcon.setOnClickListener {
            // Navigate to ProfileActivity
            val intent = Intent(this, ProfileActivity::class.java)
            // Prevent multiple instances of ProfileActivity
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }
    }
}
