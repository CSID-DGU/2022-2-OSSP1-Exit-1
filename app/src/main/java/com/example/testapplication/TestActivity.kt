package com.example.testapplication

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class TestActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_test)

        val drawerLayout = findViewById<DrawerLayout>(R.id.drawerLayout)
        findViewById<View>(R.id.imageMenu).setOnClickListener { // start에 지정된 Drawer 열기
            drawerLayout.openDrawer(GravityCompat.END)
        }
        val navigationView = findViewById<NavigationView>(R.id.side_menu)
        navigationView.itemIconTintList = null
    }
}