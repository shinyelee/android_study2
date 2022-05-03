package com.shinyelee.android_study2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.recyclerview.widget.LinearLayoutManager
import com.shinyelee.android_study2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val TAG: String = "로그"

    private var vBinding : ActivityMainBinding? = null
    private val binding get() = vBinding!!

//    val DataList = arrayListOf(
//        Data(R.drawable.paw, "1번"),
//        Data(R.drawable.paw, "2번"),
//        Data(R.drawable.paw, "3번"),
//        Data(R.drawable.paw, "4번"),
//        Data(R.drawable.paw, "5번"),
//        Data(R.drawable.paw, "6번"),
//        Data(R.drawable.paw, "7번"),
//        Data(R.drawable.paw, "8번"),
//        Data(R.drawable.paw, "9번"),
//        Data(R.drawable.paw, "10번"),
//        Data(R.drawable.paw, "11번"),
//        Data(R.drawable.paw, "12번"),
//        Data(R.drawable.paw, "13번"),
//        Data(R.drawable.paw, "14번"),
//        Data(R.drawable.paw, "15번"),
//        Data(R.drawable.paw, "16번"),
//        Data(R.drawable.paw, "17번"),
//        Data(R.drawable.paw, "18번"),
//        Data(R.drawable.paw, "19번"),
//        Data(R.drawable.paw, "20번")
//    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.activity_main)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = CustomAdapter()
    }

    override fun onDestroy() {
        vBinding = null
        super.onDestroy()
    }

}