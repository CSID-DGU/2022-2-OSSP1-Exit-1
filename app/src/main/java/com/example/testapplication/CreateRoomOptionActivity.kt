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
    private lateinit var BindingOption: ActivityCreateRoomOptionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BindingOption = ActivityCreateRoomOptionBinding.inflate(layoutInflater)
        setContentView(BindingOption.root)

        //스피너 어댑터
        //var sData = resources.getStringArray(R.array.testarray)
        var sData = listOf("선택하세요","test1","test2","test3")
        var adapter = ArrayAdapter<String>(this, R.layout.simple_list_item_1,sData)
        val spinDifficulty =BindingOption.spinnerDifficulty
        spinDifficulty.adapter=adapter
        val spinThema =BindingOption.spinnerThema
        spinThema.adapter=adapter
        val spinScary =BindingOption.spinnerLocal5
        spinScary.adapter=adapter


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