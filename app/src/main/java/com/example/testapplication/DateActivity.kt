package com.example.testapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.example.testapplication.databinding.ActivityDatecbBinding

class DateActivity : AppCompatActivity() {
    private lateinit var btn_next: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDatecbBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            cbMon.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) Log.d("체크박스", "월요일 체크")
                else Log.d("체크박스", "월요일 해제")
            }
            cbTue.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) Log.d("체크박스", "화요일 체크")
                else Log.d("체크박스", "화요일 해제")
            }
            cbWed.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) Log.d("체크박스", "수요일 체크")
                else Log.d("체크박스", "수요일 해제")
            }
            cbThu.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) Log.d("체크박스", "목요일 체크")
                else Log.d("체크박스", "목요일 해제")
            }
            cbFri.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) Log.d("체크박스", "금요일 체크")
                else Log.d("체크박스", "금요일 해제")
            }
            cbSat.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) Log.d("체크박스", "토요일 체크")
                else Log.d("체크박스", "토요일 해제")
            }
            cbSun.setOnCheckedChangeListener { _, isChecked ->
                if (isChecked) Log.d("체크박스", "일요일 체크")
                else Log.d("체크박스", "일요일 해제")
            }
        }
        btn_next=findViewById(R.id.btn_datenext)

        btn_next.setOnClickListener {
            val intent = Intent(this, TimeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}