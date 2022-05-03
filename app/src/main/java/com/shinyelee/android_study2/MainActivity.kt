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

class MainActivity : AppCompatActivity() {

    val TAG: String = "로그"

    private var vBinding : ActivityMainBinding? = null
    private val binding get() = vBinding!!

    var DataList = arrayListOf(
        Data(R.drawable.paw, "0번"),
        Data(R.drawable.paw, "1번"),
        Data(R.drawable.paw, "2번"),
        Data(R.drawable.paw, "3번")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        vBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.listView.adapter = CustomAdapter(this, DataList)

//        binding.listView.onItemClickListener = AdapterView.OnItemClickListener {parent, view, position, id ->
//            val selectItem = parent.getItemAtPosition(position) as Data
//            Toast.makeText(this, selectItem.name, Toast.LENGTH_SHORT).show()
//        }
    }

    override fun onDestroy() {
        vBinding = null
        super.onDestroy()
    }

}