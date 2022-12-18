package com.example.testapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testapplication.databinding.ActivityMatchingTotalBinding

class MatchingTotalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMatchingTotalBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val area1 = intent.getStringExtra("area1")
        binding.tvArea1.text = area1
        val area2 = intent.getStringExtra("area2")
        binding.tvArea2.text = area2
        val area3 = intent.getStringExtra("area3")
        binding.tvArea3.text = area3
        val startdate = intent.getStringExtra("startdate")
        binding.tvDateStart.text = startdate
        val enddate = intent.getStringExtra("enddate")
        binding.tvDateEnd.text = enddate
        val genre = intent.getStringExtra("genre")
        binding.tvGenre.text = genre
        val diff = intent.getStringExtra("diff")
        binding.tvLevel.text = diff
        val activity = intent.getStringExtra("activity")
        binding.tvActivity.text = activity
        val fear = intent.getStringExtra("fear")
        binding.tvFear.text = fear

        binding.btnBack.setOnClickListener {
            val intent = Intent(this, MatchingOptionActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.btnCreate.setOnClickListener {
            val intent = Intent(this, Recommend_list::class.java)
            startActivity(intent)
            finish()
        }
    }





}