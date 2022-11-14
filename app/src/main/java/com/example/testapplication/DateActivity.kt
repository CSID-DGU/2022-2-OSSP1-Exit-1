package com.example.testapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.testapplication.databinding.ActivityDatecbBinding

class DateActivity : AppCompatActivity() {
    private lateinit var btn_next: Button
    private lateinit var btn_past: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDatecbBinding.inflate(layoutInflater)
        setContentView(binding.root)

        btn_next=findViewById(R.id.btn_next)
        btn_past=findViewById(R.id.btn_back)

        btn_next.setOnClickListener {
            val intent = Intent(this, TimeActivity::class.java)
            startActivity(intent)
            finish()
        }

        btn_past.setOnClickListener {
            val intent = Intent(this, Matching_intro::class.java)
            startActivity(intent)
            finish()
        }
    }
}