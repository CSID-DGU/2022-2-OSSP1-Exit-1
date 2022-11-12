package com.example.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testapplication.databinding.ActivityCreateRoomBinding


class CreateRoomActivity : AppCompatActivity() {
    private var mBinding: ActivityCreateRoomBinding? = null
    private val binding get()=mBinding!!



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityCreateRoomBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_create_room)

        var fragN : Int = 0
        setFrag(fragN)
        binding.btnNext.setOnClickListener{
            if(fragN<3) {
                fragN += 1
                setFrag(fragN)
            }
        }
        binding.btnPast.setOnClickListener{
            if(fragN>0) {
                fragN -= 1
                setFrag(fragN)
            }
        }
    }

    private fun setFrag(fragNum : Int) {
        val ft = supportFragmentManager.beginTransaction()
        when(fragNum)
        {
            0->{
                ft.replace(R.id.frame_createroom, FragmentSelectLocal()).commit()
            }
            1->{
                ft.replace(R.id.frame_createroom, FragmentSelectOption()).commit()
            }
        }
    }
}