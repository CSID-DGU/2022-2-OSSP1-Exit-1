package com.example.testapplication

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.core.content.ContextCompat
import com.example.testapplication.databinding.ActivityCreateRoomDateBinding
import com.example.testapplication.databinding.ActivityDatecbBinding
import com.example.testapplication.databinding.FragmentMatchingBinding
import java.util.*

class CreateRoomDateActivity : AppCompatActivity() {
    private lateinit var btn_next: Button
    private lateinit var btn_past: Button
    var startDateString = ""
    var endDateString = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityCreateRoomDateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //시작일
        binding.ibStartdate.setOnClickListener {
            val datepickercalendar = Calendar.getInstance()
            val year = datepickercalendar.get(Calendar.YEAR)
            val month = datepickercalendar.get(Calendar.MONTH)
            val day = datepickercalendar.get(Calendar.DAY_OF_MONTH)

            val startdate = DatePickerDialog(
                this,
                R.style.DialogDatePicker_Theme,
                { _, year, monthOfYear, dayOfMonth ->
//                  월이 0부터 시작하여 1을 더해주어야함
                    val month = monthOfYear + 1
//                   선택한 날짜의 요일을 구하기 위한 calendar
                    val calendar = Calendar.getInstance()
//                    선택한 날짜 세팅
                    calendar.set(year, monthOfYear, dayOfMonth)
                    //시작일 String 값
                    startDateString = "$year/$month/$dayOfMonth"
                    Log.d("시작일: ", startDateString)
                    binding.tvStartdate.text = startDateString
                },
                year,
                month,
                day
            )
            startdate.datePicker.minDate = System.currentTimeMillis() - 1000;
            startdate.show()
        }

        binding.ibEnddate.setOnClickListener {
            val datepickercalendar = Calendar.getInstance()
            val year = datepickercalendar.get(Calendar.YEAR)
            val month = datepickercalendar.get(Calendar.MONTH)
            val day = datepickercalendar.get(Calendar.DAY_OF_MONTH)

            val enddate = DatePickerDialog(
                this,
                R.style.DialogDatePicker_Theme,
                { _, year, monthOfYear, dayOfMonth ->
//                  월이 0부터 시작하여 1을 더해주어야함
                    val month = monthOfYear + 1
//                   선택한 날짜의 요일을 구하기 위한 calendar
                    val calendar = Calendar.getInstance()
//                    선택한 날짜 세팅
                    calendar.set(year, monthOfYear, dayOfMonth)
                    //종료일 String 값
                    endDateString = "$year/$month/$dayOfMonth"
                    Log.d("종료일: " , endDateString)
                    binding.tvEnddate.text = endDateString
                },
                year,
                month,
                day
            )
            enddate.datePicker.minDate = System.currentTimeMillis() - 1000;
            enddate.show()
        }


        //다음으로 클릭
        binding.btnNext.setOnClickListener {
            val intent = Intent(this, CreateRoomOptionActivity::class.java)
            startActivity(intent)
            finish()
        }

        //이전으로 클릭
        binding.btnPrev.setOnClickListener {
            val intent = Intent(this, CreateRoomLocalActivity::class.java)
            ContextCompat.startActivity(this, intent,null)
        }
    }
}