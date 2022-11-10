package com.example.testapplication

import MyAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Recommend_list : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recommend_list)

        //리스트에 사용될 ArrayList를 생성한다.
        val recyclerViewItems: ArrayList<RoomData> = ArrayList()
        recyclerViewItems.add(RoomData("daeun","1"))
        recyclerViewItems.add(RoomData("daeun","1"))
        recyclerViewItems.add(RoomData("daeun","1"))
        recyclerViewItems.add(RoomData("daeun","1"))
        recyclerViewItems.add(RoomData("daeun","1"))

        //recyclerView 연결
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = MyAdapter(recyclerViewItems)
        recyclerView.adapter = adapter

    }
}