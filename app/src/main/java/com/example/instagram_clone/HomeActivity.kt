package com.example.instagram_clone

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var homeIcon: ImageView
    private lateinit var searchIcon: ImageView
    private lateinit var reelIcon: ImageView
    private lateinit var profileIcon: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Initialize views with the correct IDs from the footer layout
        homeIcon = findViewById(R.id.homeIcon)       // Correct ID: homeIcon
        searchIcon = findViewById(R.id.searchIcon)       // Correct ID: search
        reelIcon = findViewById(R.id.reelIcon)       // Correct ID: reelIcon
        profileIcon = findViewById(R.id.profileIcon) // Correct ID: profileIcon

        // Footer navigation actions
        homeIcon.setOnClickListener {
            // No action needed for home icon as the user is already on HomeActivity
        }

        searchIcon.setOnClickListener {
            val intent = Intent(this, SearchActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }

        reelIcon.setOnClickListener {
            // Handle reel icon navigation (you can define the activity or task here)
        }

        profileIcon.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }
    }
}
