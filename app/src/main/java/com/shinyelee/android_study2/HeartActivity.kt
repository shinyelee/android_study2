package com.shinyelee.android_study2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieDrawable
import com.shinyelee.android_study2.databinding.ActivityMainBinding

class HeartActivity : AppCompatActivity() {

    // 뷰바인딩
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 뷰바인딩
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(R.layout.activity_heart)

    }

}