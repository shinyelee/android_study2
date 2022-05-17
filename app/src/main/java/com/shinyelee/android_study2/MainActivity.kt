package com.shinyelee.android_study2

import android.content.Context
import android.media.AudioManager
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

    }

    fun Audio(v: View) {
        var audioManager = getSystemService(Context.AUDIO_SERVICE) as AudioManager
        audioManager.getStreamVolume(AudioManager.STREAM_MUSIC)
        audioManager.getStreamVolume(AudioManager.STREAM_VOICE_CALL)
        audioManager.getStreamVolume(AudioManager.STREAM_RING)
        audioManager.getStreamVolume(AudioManager.STREAM_ALARM)
    }

    override fun onDestroy() {
        vBinding = null
        super.onDestroy()
    }

}