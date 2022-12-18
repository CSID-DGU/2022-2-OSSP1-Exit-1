package com.example.testapplication

import android.R
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.testapplication.databinding.ActivityCreateRoomNameBinding

class CreateRoomNameActivity : AppCompatActivity() {

    private lateinit var Binding: ActivityCreateRoomNameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Binding = ActivityCreateRoomNameBinding.inflate(layoutInflater)
        setContentView(Binding.root)


        Binding.btnPrev.setOnClickListener {
            val intent2 = Intent(this, CreateRoomOptionActivity::class.java)
            startActivity(intent2)
            finish()
        }
        //페이지 이동
        Binding.btnNext.setOnClickListener {
            val intent2 = Intent(this, CreateTotalActivity::class.java)
            startActivity(intent2)
            finish()
        }
        Binding.btnBack.setOnClickListener{
            val intent2= Intent(this, MainActivity::class.java)
            startActivity(intent2)
            finish()
        }
    }
}