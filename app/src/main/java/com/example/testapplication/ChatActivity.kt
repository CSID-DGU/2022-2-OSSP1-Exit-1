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

        api.getAllChat(24).enqueue(object : retrofit2.Callback<getAllChat>{
            override fun onResponse(call: Call<getAllChat>, response: Response<getAllChat>) {
               Log.d("res", response.body().toString())
                var chatArray = response.body().toString().replace("getAllChat(result=", "")
                chatArray = chatArray.replace(")", "")
                var chatInfo = chatArray.split("/")
                Log.d("chatInfo", chatInfo[0].toString())
                val preferences = getSharedPreferences("userInfo", MODE_PRIVATE)
                val userId = preferences.getString("userId", "")

                datas.apply {
                    for(i: Int in 0..chatInfo.size-2) {
                        var chat = chatInfo[i].split(",")
                        if(userId == chat[0]){
                            add(chatData(name = chat[0], msg = chat[1], time = chat[2], multi_type2))
                        }
                        else{
                            add(chatData(name = chat[0], msg = chat[1], time = chat[2], multi_type1))
                            }
                    }
                    multiAdapter.datas = datas
                    multiAdapter.notifyDataSetChanged()

                }


            }

            override fun onFailure(call: Call<getAllChat>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })

        Binding.btnBack.setOnClickListener {
            val intent2 = Intent(this, MainActivity::class.java)

            }
        Binding.massageSend.setOnClickListener {
            val preferences = getSharedPreferences("userInfo", MODE_PRIVATE)
            Log.d("datetime", Binding.chatInput.text.toString())
            api.sendChat(
                preferences.getString("userId", ""),
                Binding.chatInput.text.toString(),
                24,
                LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME).toString()
            ).enqueue(object : retrofit2.Callback<Void> {
                override fun onResponse(call: Call<Void>, response: Response<Void>) {
                    Log.d(
                        "datetime",
                        LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                            .toString()
                    )
                }

                override fun onFailure(call: Call<Void>, t: Throwable) {
                    Log.d("chatFail", "chaasdf")
                }

            })

            Binding.btnBack.setOnClickListener {
                val intent2 = Intent(this, MainActivity::class.java)
                startActivity(intent2)
                finish()
            }
        }
    }
}