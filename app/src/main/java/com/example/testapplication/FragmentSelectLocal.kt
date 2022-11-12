package com.example.testapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AdapterView
import android.widget.Spinner
import androidx.fragment.app.Fragment

class FragmentSelectLocal : Fragment(){
    override fun onCreateView(

        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_select_local, container,false)
        val localdata = resources.getStringArray(R.array.arr)

        return view
    }
}
