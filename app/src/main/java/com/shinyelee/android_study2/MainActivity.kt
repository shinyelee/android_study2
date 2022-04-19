package com.shinyelee.android_study2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

// 메인화면
class MainActivity : AppCompatActivity() {

    val TAG: String = "로그"
    // 뷰 생성
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 그릴 xml 뷰 파일을 연결(설정) 시켜줌
        setContentView(R.layout.activity_main)

    }

    fun onDialogBtnClicked(view: View) {
        Log.d(TAG, "MainActivity - onDialogBtnClicked() called")

        val myCustomDialog = MyCustomDialog(this)

        myCustomDialog.show()
    }

}