package com.example.myapplication.listHero

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityDetailHeroBinding

class DetailHeroActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "hero_name"
        const val EXTRA_DESC = "hero_description"
        const val EXTRA_PHOTO = "hero_photo"
    }

    private lateinit var binding: ActivityDetailHeroBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailHeroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        displayHeroDetail()
    }

    private fun displayHeroDetail() {
        binding.tvHeroDetailName.text = intent.getStringExtra(EXTRA_NAME)
        binding.tvHeroDetailDesc.text = intent.getStringExtra(EXTRA_DESC)
        Glide.with(this)
            .load(intent.getStringExtra(EXTRA_PHOTO))
            .apply(
                RequestOptions()
                    .centerCrop()
                    .placeholder(R.drawable.ic_launcher_foreground)
                    .error(R.drawable.ic_launcher_foreground)
            )
            .into(binding.tvHeroDetailImage)
    }
}