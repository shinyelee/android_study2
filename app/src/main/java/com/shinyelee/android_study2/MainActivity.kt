package com.shinyelee.android_study2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shinyelee.android_study2.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private var vBinding : ActivityMainBinding? = null
    private val binding get() = vBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        vBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.calendarView.setOnDateChangeListener { calendarView, year, month, day ->
        // 월(month)은 1이 아니라 0부터 시작하니 주의!
//            println(year.toString() + "/" + month.toString() + "/" + day.toString())
        }
        val calendar = Calendar.getInstance()
        // 기본값 세팅하기
        calendar.set(2022, 5, 15)
        binding.calendarView.setDate(calendar.timeInMillis)

    }

    override fun onDestroy() {
        vBinding = null
        super.onDestroy()
    }

}