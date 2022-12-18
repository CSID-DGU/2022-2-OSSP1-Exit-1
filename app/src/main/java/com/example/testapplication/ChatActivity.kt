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

    private lateinit var binding: ActivityChatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChatBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val drawerLayout = findViewById<DrawerLayout>(R.id.drawerLayout)
        findViewById<View>(R.id.imageMenu).setOnClickListener { // start에 지정된 Drawer 열기
            drawerLayout.openDrawer(GravityCompat.END)
        }
        val navigationView = findViewById<NavigationView>(R.id.side_menu)
        navigationView.itemIconTintList = null

        binding.btnBack.setOnClickListener{
            val intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
