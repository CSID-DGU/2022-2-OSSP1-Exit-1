package com.example.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RelativeLayout
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.drawer_navi)

        //버튼을 눌러 메뉴를 오픈할 수도 있고, 왼쪽에서 오른쪽으로 스왑해 오픈할 수 있습니다.
        //DrawerLayout의 id에 직접 openDrawer()메소드를 사용할 수 있습니다.
        open_menu_btn.setOnClickListener {
            main_drawer_layout.openDrawer((GravityCompat.START))
        }

    }
}