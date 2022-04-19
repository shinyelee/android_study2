package com.shinyelee.android_study2

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MyCustomDialog(context: Context,
                     MyCustomDialogInterface: MyCustomDialogInterface)
                    : Dialog(context) {

    val TAG: String = "로그"

    private var myCustomDialogInterface: MyCustomDialogInterface? = null

    // 인터페이스 연결
    init {
        this.myCustomDialogInterface = MyCustomDialogInterface
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.custom_dialog)

        Log.d(TAG, "MyCustomDialog - onCreate() called")
        // 배경 투명
        window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        findViewById<Button>(R.id.subscribe_btn).setOnClickListener {
            Log.d(TAG, "MyCustomDialog - 구독 버튼 클릭됨")
            this.myCustomDialogInterface?.onSubscribeBtnClicked()
        }

        findViewById<Button>(R.id.like_btn).setOnClickListener {
            Log.d(TAG, "MyCustomDialog - 좋아요 버튼 클릭됨")
            this.myCustomDialogInterface?.onLikeBtnClicked()
        }

    }

}