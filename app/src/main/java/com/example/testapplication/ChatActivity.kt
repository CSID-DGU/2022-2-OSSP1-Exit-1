package com.example.testapplication

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import android.util.Log
import androidx.annotation.RequiresApi
import com.example.testapplication.databinding.ActivityChatBinding
import com.example.testapplication.databinding.ActivityCreateRoomLocalBinding
import com.google.android.material.navigation.NavigationView
import retrofit2.Call
import retrofit2.Response
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class ChatActivity : AppCompatActivity() {

    lateinit var multiAdapter: chatAdapter
    val datas = mutableListOf<chatData>()

    private val api = APIS.create()
    private lateinit var Binding: ActivityChatBinding
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Binding = ActivityChatBinding.inflate(layoutInflater)
        setContentView(Binding.root)
        multiAdapter = chatAdapter(this)
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
        val preferences = getSharedPreferences("userInfo", MODE_PRIVATE)

        Binding.chatSubmitButton.setOnClickListener {
            Log.d("datetime", Binding.chatInput.text.toString())
            api.sendChat(
                preferences.getString("userId", ""),
                Binding.chatInput.text.toString(),
                24,
                LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME).toString()
            ).enqueue(object : retrofit2.Callback<Void> {
                override fun onResponse(call: Call<Void>, response: Response<Void>) {
                    Log.d("datetime", LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME).toString())
                }

                override fun onFailure(call: Call<Void>, t: Throwable) {
                    Log.d("chatFail", "chaasdf")
                }

            })
        }

        Binding.btnBack.setOnClickListener{
            val intent2= Intent(this, MainActivity::class.java)
            startActivity(intent2)
            finish()
        }
    }
}