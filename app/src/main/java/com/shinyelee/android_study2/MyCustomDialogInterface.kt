package com.shinyelee.android_study2

interface MyCustomDialogInterface {

    fun onSubscribeBtnClicked()
    fun onLikeBtnClicked()

}

// 메모 //

// 강의에서는 kotlin-android-extensions 사용
// ViewBinding으로 하면 왜인지 모르겠으나 setOnClickListener 안 먹힘
// -> 안드로이드 스튜디오 3.6 Canary 11 이상에서만 적용된다고 합
// -> 다른 프로젝트때문에 당분간 3.0 Arctic Fox 써야 함
// -> 결국 findViewById로 바꾸며 불필요한 코드 늘어남

// 버튼에 리스너 통해 행동 직접 정의하면 인터페이스 쓸 필요 없는데 굳이 쓴 이유는?
// -> 일하다보면 비슷한 상황에서 인터페이스 구현하고
//    액티비티에서 클릭이벤트 알아야 하는 경우가 있다고 함