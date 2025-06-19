package com.example.mymusic

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailedSreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed)

        val tvPlaylistDisplay = findViewById<TextView>(R.id.tvPlaylistDisplay)
        val btnCalculateAverage = findViewById<Button>(R.id.btnCalculateAverage)
        val btnBackToMain = findViewById<Button>(R.id.btnBackToMain)

        // Show the playlist content
        val playlistBuilder = StringBuilder()
        for (i in songTitles.indices) {
            playlistBuilder.append("🎵 Title: ${songTitles[i]}\n")
            playlistBuilder.append("👤 Artist: ${artistNames[i]}\n")
            playlistBuilder.append("⭐ Rating: ${ratings[i]}\n")
            playlistBuilder.append("💬 Comment: ${comments[i]}\n\n")
        }

        if (playlistBuilder.isEmpty()) {
            tvPlaylistDisplay.text = "No songs added yet."
        } else {
            tvPlaylistDisplay.text = playlistBuilder.toString()
        }

        // Calculate average rating
        btnCalculateAverage.setOnClickListener {
            if (ratings.isNotEmpty()) {
                val average = ratings.sum().toDouble() / ratings.size
                tvPlaylistDisplay.append("\n🎧 Average Rating: %.2f".format(average))
            } else {
                tvPlaylistDisplay.append("\nNo ratings to calculate.")
            }
        }

        // Go back to MainActivity
        btnBackToMain.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}