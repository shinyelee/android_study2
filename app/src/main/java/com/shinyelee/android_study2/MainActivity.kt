package com.shinyelee.android_study2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Toast
import com.shinyelee.android_study2.databinding.ActivityMainBinding

// 메인화면
class MainActivity : AppCompatActivity() {

    val TAG: String = "로그"

    private var vBinding : ActivityMainBinding? = null
    private val binding get() = vBinding!!

    // 뷰 생성
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        vBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val item = arrayOf("1번", "2번", "3번", "4번", "5번", "6번", "7번", "8번", "9번", "10번", "11번", "12번", "13번", "14번", "15번")
        binding.listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, item)

        // 각 아이템 클릭하면 해당하는 토스트 메시지 띄움
        binding.listView.onItemClickListener = AdapterView.OnItemClickListener {parent, view, position, id ->
            val selectItem = parent.getItemAtPosition(position)
            Toast.makeText(this, selectItem.toString(), Toast.LENGTH_SHORT).show()
        }
    }

    override fun onDestroy() {
        vBinding = null
        super.onDestroy()
    }

}