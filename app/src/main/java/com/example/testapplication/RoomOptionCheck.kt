package com.example.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.testapplication.databinding.ActivityRoomOptionCheckBinding
import retrofit2.Call
import retrofit2.Response

class RoomOptionCheck : AppCompatActivity() {
    private lateinit var binding: ActivityRoomOptionCheckBinding

    private val api = APIS.create()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRoomOptionCheckBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val createrUserId = "test5"
        val title = binding.tvRoom
        val region1 = binding.tvArea
        val region2 = "혜화"
        val region3 = "성수"
        val dateFrom = binding.tvDatestart
        val dateTo = binding.tvDateend
        val genre = binding.tvGenre
        val difficulty = binding.tvLevel
        val fear = binding.tvFear
        val activity = binding.tvAct
        val roomIntro = binding.tvRoomdes

        val dateFromArray = dateFrom.text.toString().split("/")
        Log.d("dateFrom", region1.text.toString())
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

        binding.btnCheck.setOnClickListener {
            api.createRoom(
                createrUserId,
                title.text.toString(),
                region1.text.toString(),
                region2,
                region3,
                dateFromString,
                dateToString,
                genre.text.toString(),
                difficultyNum,
                fearNum,
                activityNum,
                roomIntro.text.toString()
            ).enqueue(object : retrofit2.Callback<createRoomPostModel> {
                override fun onResponse(
                    call: Call<createRoomPostModel>,
                    response: Response<createRoomPostModel>
                ) {
                    Log.d("createRoom", "asdfasdf")
                    if(response.body()?.result.toString() == "createRoomSuccess") {
                        Log.d("createRoom", "create room success")
                        Toast.makeText(applicationContext, response.body()?.result.toString(), Toast.LENGTH_SHORT).show()
                    } else {
                        Log.d("aassddff", "aassddff")
                        Toast.makeText(applicationContext, response.body()?.result.toString(), Toast.LENGTH_SHORT).show()
                    }
                }

                override fun onFailure(call: Call<createRoomPostModel>, t: Throwable) {
                    Log.d("createRoomFail", "createRoomFail")
                    Log.d("createRoomFail", t.toString())
                }

            })
        }
    }
}