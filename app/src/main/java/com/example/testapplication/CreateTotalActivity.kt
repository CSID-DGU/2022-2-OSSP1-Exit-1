package com.example.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testapplication.databinding.ActivityCreateTotalBinding

class CreateTotalActivity : AppCompatActivity() {
    private val api = APIS.create()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityCreateTotalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val createrUserId = "test5"
        val roomtitle = intent.getStringExtra("roomtitle")
        binding.tvRoomtitle.text = roomtitle
        val region1 = intent.getStringExtra("area1")
        binding.tvArea1.text = region1
        val region2 = intent.getStringExtra("area2")
        binding.tvArea2.text = region2
        val region3 = intent.getStringExtra("area3")
        binding.tvArea3.text = region3
        val dateFrom = intent.getStringExtra("startdate")
        binding.tvDateStart.text = dateFrom
        val dateTo = intent.getStringExtra("enddate")
        binding.tvDateEnd.text = dateTo
        val genre = intent.getStringExtra("genre")
        binding.tvGenre.text = genre
        val difficulty = intent.getStringExtra("diff")
        binding.tvLevel.text = difficulty
        val fear = intent.getStringExtra("fear")
        binding.tvFear.text = fear
        val activity = intent.getStringExtra("activity")
        binding.tvActivity.text = activity
        val roomIntro = intent.getStringExtra("roomintro")
        binding.tvDes.text = roomIntro

        val dateFromArray = dateFrom.toString().split("/")
        var dateFromString = ""
        for(i in 0 until 3) {
            dateFromString += dateFromArray[i]
            dateFromString += "."
        }
        dateFromString = dateFromString.toString().substring(0, dateFromString.toString().length - 1)

        val dateToArray = dateTo.toString().split("/")
        var dateToString = ""
        for(i in 0 until 3) {
            dateToString += dateToArray[i]
            dateToString += "."
        }
        dateToString = dateToString.toString().substring(0, dateToString.toString().length - 1)

        var difficultyNum = -1
        if(difficulty.toString() == "상")
            difficultyNum = 2
        else if(difficulty.toString() == "중")
            difficultyNum = 1
        else if (difficulty.toString() == "하")
            difficultyNum = 0

        var fearNum = -1
        if(fear.toString() == "상")
            fearNum = 2
        else if(fear.toString() == "중")
            fearNum = 1
        else if (fear.toString() == "하")
            fearNum = 0

        var activityNum = -1
        if(activity.toString() == "상")
            activityNum = 2
        else if(activity.toString() == "중")
            activityNum = 1
        else if (activity.toString() == "하")
            activityNum = 0


    }


}