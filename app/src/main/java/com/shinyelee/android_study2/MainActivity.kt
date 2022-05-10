package com.shinyelee.android_study2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.SearchView
import com.shinyelee.android_study2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var vBinding : ActivityMainBinding? = null
    private val binding get() = vBinding!!

    private var MyList = arrayOf("yeji", "ryujin", "chaeryeong", "yuna", "lia")

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        vBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.searchView.setOnQueryTextListener(object:SearchView.OnQueryTextListener {

            override fun onQueryTextSubmit(p0: String?): Boolean {
                println(p0 + " 입력완료")
                return true
            }

            override fun onQueryTextChange(p0: String?): Boolean {
                if(p0 != "") {
                    val curList = MyList.filter { x -> x.toLowerCase().contains(p0?.toLowerCase().toString()) }
                    for (i in curList) println(i)
                    println("----------")
                }
                return true
            }

        })

    }

    override fun onDestroy() {
        vBinding = null
        super.onDestroy()
    }

}