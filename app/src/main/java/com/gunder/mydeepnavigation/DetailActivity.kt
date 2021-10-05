package com.gunder.mydeepnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gunder.mydeepnavigation.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    //    binding
    private lateinit var binding: ActivityDetailBinding

    companion object {
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_MASSAGE = "extra_massage"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val title = intent.getStringExtra(EXTRA_TITLE)
        val message = intent.getStringExtra(EXTRA_MASSAGE)

        binding.tvTitle.text = title
        binding.tvMassage.text = message
    }
}