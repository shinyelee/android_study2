package com.shinyelee.android_study2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.shinyelee.android_study2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var vBinding : ActivityMainBinding? = null
    private val binding get() = vBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        vBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "스낵바 등장!", Snackbar.LENGTH_LONG).show()
        }

    }

    override fun onDestroy() {
        vBinding = null
        super.onDestroy()
    }

}