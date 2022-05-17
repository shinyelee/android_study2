package com.shinyelee.android_study2

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.VibrationEffect
import android.os.Vibrator
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.SearchView
import com.google.android.material.tabs.TabLayout
import com.shinyelee.android_study2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var vBinding : ActivityMainBinding? = null
    private val binding get() = vBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        vBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener { Vibration(1000L) }

    }

    fun Vibration(len:Long) {
        val vibrator = getSystemService(Context.VIBRATOR_MANAGER_SERVICE) as Vibrator
        vibrator.vibrate(len)
    }

    override fun onDestroy() {
        vBinding = null
        super.onDestroy()
    }

}