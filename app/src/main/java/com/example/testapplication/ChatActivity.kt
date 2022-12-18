package com.example.testapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.testapplication.databinding.ActivityChatBinding
import com.example.testapplication.databinding.ActivityCreateRoomLocalBinding
import com.google.android.material.navigation.NavigationView

class ChatActivity : AppCompatActivity() {

    private lateinit var Binding: ActivityChatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Binding = ActivityChatBinding.inflate(layoutInflater)
        setContentView(Binding.root)
        setContentView(R.layout.activity_chat)

        val drawerLayout = findViewById<DrawerLayout>(R.id.drawerLayout)
        findViewById<View>(R.id.imageMenu).setOnClickListener { // start에 지정된 Drawer 열기
            drawerLayout.openDrawer(GravityCompat.END)
        }
        val navigationView = findViewById<NavigationView>(R.id.side_menu)
        navigationView.itemIconTintList = null
        Binding.btnBack.setOnClickListener{
            val intent2= Intent(this, MainActivity::class.java)
            startActivity(intent2)
            finish()
        }

    }
}
