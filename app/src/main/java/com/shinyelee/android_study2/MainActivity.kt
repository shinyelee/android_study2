package com.shinyelee.android_study2

import android.content.Intent
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

        binding.btn.setOnClickListener {

            var intent = Intent()

            intent.setAction(Intent.ACTION_SEND)
            intent.setType("text/plain")
            intent.putExtra(Intent.EXTRA_SUBJECT, title)
            intent.putExtra(Intent.EXTRA_TEXT, "내용")

            startActivity(Intent.createChooser(intent, "공유하기"))

        }

    }

    override fun onDestroy() {
        vBinding = null
        super.onDestroy()
    }

}