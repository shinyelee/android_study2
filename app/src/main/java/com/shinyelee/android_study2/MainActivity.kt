package com.shinyelee.android_study2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

// 메인화면
class MainActivity : AppCompatActivity() {

    val TAG: String = "로그"

    // 뷰 생성
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 그릴 xml 뷰 파일을 연결(설정) 시켜줌
        setContentView(R.layout.activity_main)

        // 강의(2020년)에서는 이 방법을 사용했으나, 현재(2022년) 지원하지 않는 방법임
        // gradle에 apply plugin: 'kotlin-android-extensions' 삽입 후
//        login_btn.setOnClickListener(View.onClickListener {
//            onLoginButtonClicked()
//        })

        // -> findViewById나 ViewBinding 사용을 권장함
        // 로그인 버튼에 클릭 리스너 설정
        findViewById<Button>(R.id.login_btn).setOnClickListener {
            // 버튼을 누르면 SecondActivity 화면으로 이동
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

    }
    
    fun onLoginButtonClicked() {
        Log.d(TAG, "MainActivity - onLoginButtonClicked() called")

        // SecondActivity로 화면 이동
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }
    
}