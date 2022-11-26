package com.example.testapplication

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.testapplication.databinding.ActivityDatecbBinding
import java.util.*

class DateActivity : AppCompatActivity() {
    private lateinit var btn_next: Button
    private lateinit var btn_past: Button
    var dateString = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDatecbBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvStartdate.setOnClickListener {
            val cal = Calendar.getInstance()    //캘린더뷰 만들기
            val dateSetListener = DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                dateString = "${year}년 ${month+1}월 ${dayOfMonth}일"
                binding.tvStartdate.text = "시작일 : " + dateString
            }
            DatePickerDialog(this, dateSetListener, cal.get(Calendar.YEAR),cal.get(Calendar.MONTH),cal.get(Calendar.DAY_OF_MONTH)).show()
        }



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