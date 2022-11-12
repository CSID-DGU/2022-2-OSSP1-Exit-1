package com.example.testapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CreateRoomActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_room)

        setFrag(0)
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