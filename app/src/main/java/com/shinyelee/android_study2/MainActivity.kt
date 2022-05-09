package com.shinyelee.android_study2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shinyelee.android_study2.databinding.ActivityMainBinding
import java.util.*
import kotlin.concurrent.timer

class MainActivity : AppCompatActivity() {

    private var vBinding : ActivityMainBinding? = null
    private val binding get() = vBinding!!

    // 진행%
    var timer : Timer? = null
    var deltaTime = 0

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        vBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // %시작
        binding.startBtn.setOnClickListener { TimerFun() }

        // %중지
        binding.stopBtn.setOnClickListener { timer?.cancel() }

    }

    // %증가
    fun TimerFun() {
        // 0.1초에 1%씩 증가, 3초 뒤 시작
        timer = timer(period = 100, initialDelay = 3000) {
            if(deltaTime > 100) cancel()
            binding.progressBar2.setProgress(++deltaTime)
            println(binding.progressBar2.progress)
        }
    }

    override fun onDestroy() {
        vBinding = null
        super.onDestroy()
    }

}