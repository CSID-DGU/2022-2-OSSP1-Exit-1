package com.example.testapplication

import android.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import com.example.testapplication.databinding.ActivityCreateRoomLocalBinding


class CreateRoomLocalActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityCreateRoomLocalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityCreateRoomLocalBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        //setContentView(R.layout.activity_create_room_local)
//스피너 어댑터
        //var sData = resources.getStringArray(R.array.testarray)
        var sData = listOf("선택하세요", "test1", "test2", "test3")
        var adapter = ArrayAdapter<String>(this, R.layout.simple_list_item_1, sData)
        val spinCity1 = mBinding.spinnerCity1
        spinCity1.adapter = adapter
        val spinDistrict1 = mBinding.spinnerDistrict1
        spinDistrict1.adapter = adapter

        val spinCity2 = mBinding.spinnerCity2
        spinCity2.adapter = adapter
        val spinDistrict2 = mBinding.spinnerDistrict2
        spinDistrict2.adapter = adapter

        val spinCity3 = mBinding.spinnerCity3
        spinCity3.adapter = adapter
        val spinDistrict3 = mBinding.spinnerDistrict3
        spinDistrict3.adapter = adapter
        //페이지 이동
//        binding.btnNext.setOnClickListener{
//            val intent= Intent(this, CreateRoomLocalActivity::class.java)
//            startActivity(intent)
//            finish()
//        }
        mBinding.btnNext.setOnClickListener {
            val intent1 = Intent(this, CreateRoomDateActivity::class.java)
            startActivity(intent1)
            finish()
        }
        mBinding.btnPrev.isEnabled = false
        mBinding.btnBack.setOnClickListener {
            val intent2 = Intent(this, MainActivity::class.java)
            startActivity(intent2)
            finish()
        }

    }
}