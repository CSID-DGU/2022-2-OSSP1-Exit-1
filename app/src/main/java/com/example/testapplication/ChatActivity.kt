package com.example.testapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testapplication.databinding.ActivityChatBinding
import com.example.testapplication.databinding.ActivityCreateRoomLocalBinding

class ChatActivity : AppCompatActivity() {
    private lateinit var Binding: ActivityChatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Binding = ActivityChatBinding.inflate(layoutInflater)
        setContentView(Binding.root)

        Binding.btnBack.setOnClickListener{
            val intent2= Intent(this, MainActivity::class.java)
            startActivity(intent2)
            finish()
        }
    }
}
