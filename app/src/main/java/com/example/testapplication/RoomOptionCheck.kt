package com.example.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testapplication.databinding.ActivityRoomOptionCheckBinding

class RoomOptionCheck : AppCompatActivity() {
    private lateinit var binding: ActivityRoomOptionCheckBinding

    private val api = APIS.create()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRoomOptionCheckBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val title = binding.tvRoom
        val region1 = binding.tvArea
        val dateFrom = binding.tvDatestart
        val dateTo = binding.tvDateend
        val genre = binding.tvGenre
        val difficulty = binding.tvLevel
        val fear = binding.tvFear
        val activity = binding.tvAct
        val roomIntro = binding.tvRoomdes

        val dateFromArray = dateFrom.text.toString().split("/")
        var dateFromString = ""
        for(i in 0 until 3) {
            dateFromString += dateFromArray[i]
            dateFromString += "."
        }
        dateFromString = dateFromString.toString().substring(0, dateFromString.toString().length - 1)

        val dateToArray = dateTo.text.toString().split("/")
        var dateToString = ""
        for(i in 0 until 3) {
            dateToString += dateToArray[i]
            dateToString += "."
        }
        dateToString = dateToString.toString().substring(0, dateToString.toString().length - 1)

        var difficultyNum = -1
        if(difficulty.text.toString() == "상")
            difficultyNum = 2
        else if(difficulty.text.toString() == "중")
            difficultyNum = 1
        else if (difficulty.text.toString() == "하")
            difficultyNum = 0

        var fearNum = -1
        if(fear.text.toString() == "상")
            fearNum = 2
        else if(fear.text.toString() == "중")
            fearNum = 1
        else if (fear.text.toString() == "하")
            fearNum = 0

        var activityNum = -1
        if(activity.text.toString() == "상")
            activityNum = 2
        else if(activity.text.toString() == "중")
            activityNum = 1
        else if (activity.text.toString() == "하")
            activityNum = 0

    }
}