package com.shinyelee.android_study2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.shinyelee.android_study2.databinding.ActivityMainBinding

// 메인화면
class MainActivity : AppCompatActivity() {

    val TAG: String = "로그"

    // (전역변수) 바인딩 객체 선언
    // bindingTest null 처리
    private var vBinding : ActivityMainBinding? = null

    // 매번 null체크 귀찮음 -> 바인딩 변수 재선언
    // bindingTest가 null이 아닐 때
    private val binding get() = vBinding!!

    // 뷰 생성
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 자동 생성된 뷰바인딩 클래스에서의 inflate 메서드 활용
        // -> 액티비티에서 사용할 바인딩 클래스의 인스턴스 생성
        vBinding = ActivityMainBinding.inflate(layoutInflater)

        // getRoot 메서드로 레이아웃 내부 최상위에 있는 뷰의 인스턴스 활용
        // -> 생성된 뷰를 액티비티에 표시
//        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        // 이제부터 xml 파일 내 뷰아이디에 접근이 가능해져 findViewById 안 써도 됨
        // 뷰아이디가 view_id인 경우 viewId(카멜케이스)로 자동 변환됨
        binding.textView.setText("뷰바인딩 어렵지 않쥬?")
    }

    // 액티비티 파괴시
    override fun onDestroy() {
        // onDestroy에서 바인딩 클래스 인스턴스 참조를 정리함
        vBinding = null
        super.onDestroy()
    }
    // -> 이렇게 해 줘야 메모리 효율이 좋다고 함

}