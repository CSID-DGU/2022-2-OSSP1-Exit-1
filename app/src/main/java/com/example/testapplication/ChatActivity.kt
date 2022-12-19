package com.example.testapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testapplication.databinding.ActivityChatBinding
import com.example.testapplication.databinding.ActivityCreateRoomLocalBinding

class ChatActivity : AppCompatActivity() {

    lateinit var multiAdapter: ChatAdapter
    val datas = mutableListOf<chatData>()

    private lateinit var Binding: ActivityChatBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Binding = ActivityChatBinding.inflate(layoutInflater)
        setContentView(Binding.root)
        multiAdapter = ChatAdapter(this)
        Binding.chatRecyclerView.adapter = multiAdapter

        datas.apply {
            add(chatData(name = "이다은", msg = "하이요", time = "22", multi_type1))
            add(chatData(name = "이석민", msg = "jenny", time = "26", multi_type2))
            add(chatData(name = "안하영", msg = "jhon", time = "27", multi_type1))
            multiAdapter.datas = datas
            multiAdapter.notifyDataSetChanged()

        }
        Binding.btnBack.setOnClickListener {
            val intent2 = Intent(this, MainActivity::class.java)
            startActivity(intent2)
            finish()
        }
    }
}
