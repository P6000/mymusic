package com.example.mymusic

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

// Parallel arrays to hold data
var songTitles = mutableListOf<String>()
var artistNames = mutableListOf<String>()
var ratings = mutableListOf<Int>()
var comments = mutableListOf<String>()

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Connect to XML views by their exact IDs
        val etSongTitle = findViewById<EditText>(R.id.etSongTitle)
        val etArtistName = findViewById<EditText>(R.id.etArtistName)
        val etRating = findViewById<EditText>(R.id.etRating)
        val etComments = findViewById<EditText>(R.id.etComments)

        val btnAddSong = findViewById<Button>(R.id.btnAddSong)
        val btnViewDetails = findViewById<Button>(R.id.btnViewDetails)
        val btnExit = findViewById<Button>(R.id.btnExit)

        // Add song to the playlist
        btnAddSong.setOnClickListener {
            val title = etSongTitle.text.toString().trim()
            val artist = etArtistName.text.toString().trim()
            val ratingStr = etRating.text.toString().trim()
            val comment = etComments.text.toString().trim()

            // Input validation
            if (title.isEmpty() || artist.isEmpty() || ratingStr.isEmpty()) {
                Toast.makeText(this, "Please fill in all required fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val rating = ratingStr.toIntOrNull()
            if (rating == null || rating !in 1..5) {
                Toast.makeText(this, "Rating must be a number between 1 and 5", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Add to arrays
            songTitles.add(title)
            artistNames.add(artist)
            ratings.add(rating)
            comments.add(comment)

            Toast.makeText(this, "Song added!", Toast.LENGTH_SHORT).show()

            // Clear inputs
            etSongTitle.text.clear()
            etArtistName.text.clear()
            etRating.text.clear()
            etComments.text.clear()
        }

        // Navigate to details screen
        btnViewDetails.setOnClickListener {
            val intent = Intent(this, DetailedSreen::class.java)
            startActivity(intent)
        }

        // Exit app
        btnExit.setOnClickListener {
            finish()
        }
    }
}