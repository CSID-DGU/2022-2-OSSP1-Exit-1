package com.example.testapplication

import android.R
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.app.AppCompatActivity
import com.example.testapplication.databinding.ActivityCreateRoomOptionBinding


class CreateRoomOptionActivity : AppCompatActivity() {
    private lateinit var Binding: ActivityCreateRoomOptionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Binding = ActivityCreateRoomOptionBinding.inflate(layoutInflater)
        setContentView(Binding.root)

        //스피너 어댑터
        //var sData = resources.getStringArray(R.array.testarray)
        var sData = listOf("선택하세요","판타지","19금","SF", "감성", "공포", "기타", "모험", "미션", "스토리",
        "추리", "코믹")
        var adapter = ArrayAdapter<String>(this, R.layout.simple_list_item_1,sData)
        val spinThema =Binding.spinnerThema
        spinThema.adapter=adapter
//        val btnDifficultyHigh =Binding.difficultyHigh
//        val btnDifficultyMiddle =Binding.difficultyMiddle
//        val btnDifficultyLow =Binding.difficultyLow
//        val btnScaryHigh =Binding.scaryHigh
//        val btnScaryMiddle =Binding.scaryMiddle
//        val btnScaryLow =Binding.scaryLow

        Binding.difficultyHigh.setOnClickListener{
            Binding.difficultyHigh.isSelected = Binding.difficultyHigh.isSelected != true
        }
        Binding.difficultyMiddle.setOnClickListener{
            Binding.difficultyMiddle.isSelected = Binding.difficultyMiddle.isSelected != true
        }
        Binding.difficultyLow.setOnClickListener{
            Binding.difficultyLow.isSelected = Binding.difficultyLow.isSelected!=true
        }
        Binding.fearHigh.setOnClickListener{
            Binding.fearHigh.isSelected = Binding.fearHigh.isSelected!=true
        }
        Binding.fearMiddle.setOnClickListener{
            Binding.fearMiddle.isSelected = Binding.fearMiddle.isSelected!=true
        }
        Binding.fearLow.setOnClickListener{
            Binding.fearLow.isSelected = Binding.fearLow.isSelected!=true
        }
        Binding.activityHigh.setOnClickListener{
            Binding.activityHigh.isSelected = Binding.activityHigh.isSelected!=true
        }
        Binding.activityMiddle.setOnClickListener{
            Binding.activityMiddle.isSelected = Binding.activityMiddle.isSelected!=true
        }
        Binding.activityLow.setOnClickListener{
            Binding.activityLow.isSelected = Binding.activityLow.isSelected!=true
        }


        //페이지 이동
        Binding.btnNext.setOnClickListener{
            val intent2= Intent(this, CreateRoomNameActivity::class.java)
            startActivity(intent2)
            finish()
        }
        //페이지 이동
        Binding.btnPrev.setOnClickListener{
            val intent2= Intent(this, CreateRoomDateActivity::class.java)
            startActivity(intent2)
            finish()
        }
        Binding.btnBack.setOnClickListener{
            val intent2= Intent(this, MainActivity::class.java)
            startActivity(intent2)
            finish()
        }
//        binding.btnPrev.setOnClickListener{
//            val intent= Intent(this, CreateRoomOptionActivity::class.java)
//            startActivity(intent)
//            finish()
//        }
//        var fragN : Int = 0
//        setFrag(0)
//
//        binding.btnNext.setOnClickListener{
//            if(fragN<1) {
//                fragN += 1
//                setFrag(fragN)
//            }
//        }
//        binding.btnPast.setOnClickListener{
//            if(fragN>0) {
//                fragN -= 1
//                setFrag(fragN)
//            }
//        }
    }


//    private fun setFrag(fragNum : Int) {
//        val ft = supportFragmentManager.beginTransaction()
//        when(fragNum)
//        {
//            0->{
//                ft.replace(R.id.frame_createroom, FragmentSelectLocal()).commit()
//            }
//            1->{
//                ft.replace(R.id.frame_createroom, FragmentSelectOption()).commit()
//            }
//        }
//    }
}