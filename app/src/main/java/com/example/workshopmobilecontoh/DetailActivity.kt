package com.example.workshopmobilecontoh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.workshopmobilecontoh.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity(R.layout.activity_detail) {
    private val binding : ActivityDetailBinding by viewBinding()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setData()
    }

    private fun setData() {
        binding.apply {
            val fish = intent.getParcelableExtra<Fish>(EXTRA_DETAIL)
            tvFishNameDetail.text = fish?.name
            tvFishAlbumDetail.text = fish?.order
            tvFishGenreDetail.text = fish?.family
            tvFishDescDetail.text = fish?.detail
            Glide.with(this@DetailActivity)
                .load(fish?.photo)
                .apply(RequestOptions())
                .into(ivFish)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    companion object {
        const val EXTRA_DETAIL = "extra_detail"
    }
}