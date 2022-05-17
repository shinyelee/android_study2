package com.shinyelee.android_study2

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import com.shinyelee.android_study2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var vBinding : ActivityMainBinding? = null
    private val binding get() = vBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        vBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener {

            var ad = AlertDialog.Builder(this)

            ad.setIcon(R.mipmap.ic_launcher)
            ad.setTitle("제목")
            ad.setMessage("내용")
            ad.setView(EditText(this))

            ad.setPositiveButton("Yes", object:DialogInterface.OnClickListener {
                override fun onClick(p0: DialogInterface?, p1: Int) {
                    println("Yes 클릭")
                    p0?.dismiss()
                }
            })

            ad.setNegativeButton("No", object:DialogInterface.OnClickListener {
                override fun onClick(p0: DialogInterface?, p1: Int) {
                    println("No 클릭")
                    p0?.dismiss()
                }
            })

            ad.show()

        }

    }

    override fun onDestroy() {
        vBinding = null
        super.onDestroy()
    }

}