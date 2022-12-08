package com.example.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testapplication.databinding.ActivityDatecbBinding
import com.example.testapplication.databinding.ActivityMatchingOptionCheckBinding

class MatchingOptionCheckActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMatchingOptionCheckBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val startdate = intent.getStringExtra("startdate")
        binding.tvDatestart.text = startdate
        val enddate = intent.getStringExtra("enddate")
        binding.tvDateend.text = enddate
    }
}