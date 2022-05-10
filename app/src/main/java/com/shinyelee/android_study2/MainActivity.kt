package com.shinyelee.android_study2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import com.shinyelee.android_study2.databinding.ActivityMainBinding
import java.util.*
import kotlin.concurrent.timer

class MainActivity : AppCompatActivity() {

    private var vBinding : ActivityMainBinding? = null
    private val binding get() = vBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        vBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                println(p1)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                println("움직임 시작")
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                println("움직임 끝")
            }

        })

    }

    override fun onDestroy() {
        vBinding = null
        super.onDestroy()
    }

}