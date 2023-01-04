package com.example.workshopmobilecontoh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.workshopmobilecontoh.databinding.ActivityAboutMeActivityBinding
import com.example.workshopmobilecontoh.databinding.ActivityDetailBinding

class AboutMeActivity : AppCompatActivity(R.layout.activity_about_me_activity) {
    private val binding : ActivityAboutMeActivityBinding by viewBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_me_activity)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}