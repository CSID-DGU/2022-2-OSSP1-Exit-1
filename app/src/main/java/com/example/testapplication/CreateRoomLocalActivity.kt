package com.example.testapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.testapplication.databinding.ActivityCreateRoomLocalBinding


class CreateRoomLocalActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityCreateRoomLocalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityCreateRoomLocalBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        //setContentView(R.layout.activity_create_room_local)

        //페이지 이동
//        binding.btnNext.setOnClickListener{
//            val intent= Intent(this, CreateRoomLocalActivity::class.java)
//            startActivity(intent)
//            finish()
//        }
        mBinding.btnPrev.setOnClickListener{
            val intent1= Intent(this, CreateRoomOptionActivity::class.java)
            startActivity(intent1)
            finish()
        }

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