package com.shinyelee.android_study2

import android.content.Context
import android.media.AudioManager
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.shinyelee.android_study2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var vBinding : ActivityMainBinding? = null
    private val binding get() = vBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        vBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener { Click(binding.btn) }

    }

    // 저작권 문제로 음악 파일은 올리지 않았음
    fun Click(v: View) {
        val mediaPlayer = MediaPlayer.create(this, R.raw.iu_friday)
        mediaPlayer.start()
        // 중지할 땐 반대로
//        mediaPlayer.stop()
        mediaPlayer.setOnCompletionListener { mediaPlayer.release() }
    }

    override fun onDestroy() {
        vBinding = null
        super.onDestroy()
    }

}