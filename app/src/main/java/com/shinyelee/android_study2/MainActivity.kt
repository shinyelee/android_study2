package com.shinyelee.android_study2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// 메인화면
class MainActivity : AppCompatActivity() {

    // 뷰 생성
   override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 그릴 xml 뷰 파일을 연결(설정) 시켜줌
       setContentView(R.layout.activity_main)
    }
}