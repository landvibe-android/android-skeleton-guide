package com.landvibe.project

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

/* activity
    activity 클래스를 만들면 Activity을 상속 및 Manifest에 선언이 꼭 필요하다.
    https://hyeonstorage.tistory.com/149
 */
class MainActivity : AppCompatActivity() {

    //생성될 때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //사용할 뷰 레이아웃 설
        setContentView(R.layout.activity_main)
    }
}
