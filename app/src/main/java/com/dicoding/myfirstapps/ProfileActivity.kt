package com.dicoding.myfirstapps

import android.app.ActionBar
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.core.app.TaskStackBuilder

class ProfileActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val behanceProfile: ImageView = findViewById(R.id.icon_behance)
        behanceProfile.setOnClickListener(this)

        val instagramProfile: ImageView = findViewById(R.id.icon_instagram)
        instagramProfile.setOnClickListener(this)

        val twitterProfile: ImageView = findViewById(R.id.icon_twitter)
        twitterProfile.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.icon_behance -> {
                val profileBehanceURL = "https://www.behance.net/abistaahmad1"
                val checkBehanceProfileIntent = Intent(Intent.ACTION_VIEW, Uri.parse(profileBehanceURL))
                if (checkBehanceProfileIntent.resolveActivity(packageManager) != null) {
                    startActivity(checkBehanceProfileIntent)
                }
            }
            R.id.icon_twitter -> {
                val profileTwitterURL = "https://twitter.com/Abista_AR"
                val checkTwitterProfileIntent = Intent(Intent.ACTION_VIEW, Uri.parse(profileTwitterURL))
                if (checkTwitterProfileIntent.resolveActivity(packageManager) != null) {
                    startActivity(checkTwitterProfileIntent)
                }
            }
            R.id.icon_instagram -> {
                val profileInstagramURL = "https://www.instagram.com/abs_ahmad_r/"
                val checkInstagramProfileIntent = Intent(Intent.ACTION_VIEW, Uri.parse(profileInstagramURL))
                if (checkInstagramProfileIntent.resolveActivity(packageManager) != null) {
                    startActivity(checkInstagramProfileIntent)
                }
            }
        }
    }
}