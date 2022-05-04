package com.shinyelee.android_study2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.shinyelee.android_study2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var vBinding : ActivityMainBinding? = null
    private val binding get() = vBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        vBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 체크 기본값
        binding.radioGroup.check(R.id.radioButton3)
        // 체크 해제
//        binding.radioGroup.clearCheck()

        when(binding.radioGroup.checkedRadioButtonId) {
            R.id.radioButton1 -> println("1번")
            R.id.radioButton2 -> println("2번")
            R.id.radioButton3 -> println("3번")
        }

    }

    override fun onDestroy() {
        vBinding = null
        super.onDestroy()
    }

}