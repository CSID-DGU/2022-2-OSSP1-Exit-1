package com.example.testapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testapplication.databinding.ActivityCreateRoomOptionBinding
import android.widget.Button

class CreateRoomOptionActivity : AppCompatActivity() {
    private lateinit var BindingOption: ActivityCreateRoomOptionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BindingOption = ActivityCreateRoomOptionBinding.inflate(layoutInflater)
        setContentView(BindingOption.root)
        //setContentView(R.layout.activity_create_room_option)

        //페이지 이동
        BindingOption.btnNext.setOnClickListener{
            val intent2= Intent(this, CreateRoomLocalActivity::class.java)
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