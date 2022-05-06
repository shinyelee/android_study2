package com.shinyelee.android_study2

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import android.widget.MediaController
import android.widget.Toast
import com.shinyelee.android_study2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var vBinding : ActivityMainBinding? = null
    private val binding get() = vBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        vBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 방법1
        val videoPath = "android.resource://" + getPackageName() + "/" + R.raw.joinfail
        binding.videoView.setVideoPath(videoPath)

        // 방법2
//        binding.videoView.setVideoURI(Uri.parse("https://www.radiantmediaplayer.com/media/bbb-360p.mp4"))

        val mediaController = MediaController(this)
        binding.videoView.setMediaController(mediaController)
        mediaController.setAnchorView(binding.videoView)
        binding.videoView.keepScreenOn = true

//        binding.videoView.start()
//        binding.videoView.pause()
//        binding.videoView.seekTo(10000)

    }

    override fun onDestroy() {
        vBinding = null
        super.onDestroy()
    }

}