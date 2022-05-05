package com.shinyelee.android_study2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import android.widget.Toast
import com.shinyelee.android_study2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var vBinding : ActivityMainBinding? = null
    private val binding get() = vBinding!!

    private var lastTimeBackPressed = 0L

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        vBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.webView.webViewClient = WebViewClient()
        binding.webView.loadUrl("https://shinye0213.tistory.com/")

    }

    override fun onBackPressed() {

        if(binding.webView.canGoBack()) binding.webView.goBack()

        else {

            if(System.currentTimeMillis() - lastTimeBackPressed < 1500) {
                finish()
                return
            }
            lastTimeBackPressed = System.currentTimeMillis()
            Toast.makeText(this, "'뒤로' 버튼을 한 번 더 누르면 종료됩니다.", Toast.LENGTH_SHORT).show()

        }

    }

    override fun onDestroy() {
        vBinding = null
        super.onDestroy()
    }

}