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

        // i는 시, i2는 분
        binding.timePicker.setOnTimeChangedListener { timePicker, i, i2 ->
            println(i.toString() + ":" + i2.toString())
        }

    }

    override fun onDestroy() {
        vBinding = null
        super.onDestroy()
    }

}