package com.shinyelee.android_study2

import android.content.Context
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

        val pref = getSharedPreferences("pref", Context.MODE_PRIVATE)

        // 저장
        pref.edit().putString("키", "값").apply()

        // 불러오기
        val value = pref.getString("키", "저장안됨")

        // 키 제거
        pref.edit().remove("키").apply()

        // 전체 제거
        pref.edit().clear().apply()

    }

    override fun onDestroy() {
        vBinding = null
        super.onDestroy()
    }

}