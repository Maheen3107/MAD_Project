package com.example.instagram_clone

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.imageview.ShapeableImageView

class ProfileActivity : AppCompatActivity() {

    private lateinit var circularImageView: ShapeableImageView
    private lateinit var textViewPosts: TextView
    private lateinit var textViewFollowers: TextView
    private lateinit var textViewFollowing: TextView
    private lateinit var editProfileButton: Button
    private lateinit var shareProfileButton: Button
    private lateinit var postsIcon: ImageView
    private lateinit var reelsIcon: ImageView
    private lateinit var homeIcon: ImageView
    private lateinit var searchIcon: ImageView
    private lateinit var reelIcon: ImageView
    private lateinit var profileIcon: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Initialize views
        circularImageView = findViewById(R.id.circularImageView)
        textViewPosts = findViewById(R.id.textViewPosts)
        textViewFollowers = findViewById(R.id.textViewFollowers)
        textViewFollowing = findViewById(R.id.textViewFollowing)
        editProfileButton = findViewById(R.id.button2)  // Update ID if necessary
        shareProfileButton = findViewById(R.id.button)  // Update ID if necessary
        postsIcon = findViewById(R.id.posts_icon)
        reelsIcon = findViewById(R.id.reels_icon)
        homeIcon = findViewById(R.id.homeIcon)
        searchIcon = findViewById(R.id.searchIcon)
        reelIcon = findViewById(R.id.reelIcon)
        profileIcon = findViewById(R.id.profileIcon)

        // Set up button click listeners
        editProfileButton.setOnClickListener {

        }

        shareProfileButton.setOnClickListener {
            // Handle "Share Profile" button click
            shareProfile()
        }

        // Footer navigation
        homeIcon.setOnClickListener {
            // Navigate to HomeActivity
            val intent = Intent(this, HomeActivity::class.java)
            // Prevent multiple instances of HomeActivity
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }

        searchIcon.setOnClickListener {
            // Navigate to SearchActivity
            val intent = Intent(this, SearchActivity::class.java)
            // Prevent multiple instances of SearchActivity
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }

        reelIcon.setOnClickListener {

        }

        profileIcon.setOnClickListener {
            // No action needed, user is already in ProfileActivity
        }

        // Handle post and reels icon click
        postsIcon.setOnClickListener {
            // Handle posts icon click
            showPosts()
        }

        reelsIcon.setOnClickListener {
            // Handle reels icon click
            showReels()
        }
    }

    private fun shareProfile() {
        // Share profile logic
        val shareIntent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, "Check out my profile on Instagram!")
            type = "text/plain"
        }
        startActivity(Intent.createChooser(shareIntent, "Share Profile via"))
    }

    private fun showPosts() {

    }

    private fun showReels() {

    }
}
