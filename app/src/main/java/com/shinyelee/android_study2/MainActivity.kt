package com.shinyelee.android_study2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shinyelee.android_study2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var vBinding : ActivityMainBinding? = null
    private val binding get() = vBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        vBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ratingBar.setOnRatingBarChangeListener { ratingBar, fl, b ->
            println(fl)
        }
        binding.ratingBar.rating = 3.5f
        // 5점만점에 기본값 3.5로 시작

    }

    override fun onDestroy() {
        vBinding = null
        super.onDestroy()
    }

}