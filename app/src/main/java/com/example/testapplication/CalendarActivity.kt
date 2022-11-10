package com.example.testapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CalendarActivity : AppCompatActivity() {
    private lateinit var btn_CL: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendar)
        btn_CL=findViewById(R.id.btn_CL)

        btn_CL.setOnClickListener{
            val intent= Intent(this, Recommend_list::class.java)
            startActivity(intent)
            finish()
        }


    }
}