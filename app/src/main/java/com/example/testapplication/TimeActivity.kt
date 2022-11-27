package com.example.testapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.testapplication.databinding.ActivityTimeBinding

class TimeActivity : AppCompatActivity() {
    private lateinit var btn_next: Button
    private lateinit var btn_back: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityTimeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            time1.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) Log.d("체크박스", "10시~12시 체크")
                else Log.d("체크박스", "10시~12시 해제")
            }
            time2.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) Log.d("체크박스", "12시~2시 체크")
                else Log.d("체크박스", "12시~2시 해제")
            }
            time3.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) Log.d("체크박스", "2시~4시 체크")
                else Log.d("체크박스", "2시~4시 해제")
            }
            time4.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) Log.d("체크박스", "4시~6시 체크")
                else Log.d("체크박스", "4시~6시 해제")
            }
            time5.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) Log.d("체크박스", "6시~8시 체크")
                else Log.d("체크박스", "6시~8시 해제")
            }
        }
        btn_next=findViewById(R.id.btn_next)
        btn_back=findViewById(R.id.btn_back)

        btn_next.setOnClickListener {
            val intent = Intent(this, Recommend_list::class.java)
            startActivity(intent)
            finish()
        }

        btn_back.setOnClickListener {
            val intent = Intent(this, DateActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.btnBacktop.setOnClickListener {
            val intent = Intent(this, DateActivity::class.java)
            startActivity(intent)
            finish()
        }
        binding.btnClose.setOnClickListener {
            val intent = Intent(this, Matching_intro::class.java)
            startActivity(intent)
            finish()
        }

    }
}