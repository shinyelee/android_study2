package com.shinyelee.android_study2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

// 메인화면
class MainActivity : AppCompatActivity() {

    val TAG: String = "로그"

    // 뷰 생성
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 그릴 xml 뷰 파일을 연결(설정) 시켜줌
        setContentView(R.layout.activity_main)
        Log.d(TAG, "MainActivity - onCreate() called")

        // 일반 클래스
        val myNormalClass1 = MyNormalClass()
        val myNormalClass2 = MyNormalClass()
        // 메모리 2개
        Log.d(TAG, "MainActivity - myNormalClass1 : $myNormalClass1")
        Log.d(TAG, "MainActivity - myNormalClass2 : $myNormalClass2")

        // 싱글턴 클래스
        val mySingletonClass1 = MySingletonClass
        val mySingletonClass2 = MySingletonClass
        // 메모리 1개
        Log.d(TAG, "MainActivity - mySingletonClass1 : $mySingletonClass1")
        Log.d(TAG, "MainActivity - mySingletonClass2 : $mySingletonClass2")

        // 매개변수 있는 클래스
        val mySQLOpenHelper1 = MySQLOpenHelper(this)
        val mySQLOpenHelper2 = MySQLOpenHelper(this)
        // 메모리 2개
        Log.d(TAG, "MainActivity - mySQLOpenHelper1 : $mySQLOpenHelper1")
        Log.d(TAG, "MainActivity - mySQLOpenHelper2 : $mySQLOpenHelper2")
    }

}