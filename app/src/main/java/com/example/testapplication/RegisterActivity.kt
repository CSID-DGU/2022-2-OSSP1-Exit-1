package com.example.testapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import com.example.testapplication.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity(){
    private lateinit var R_btn: Button
    private lateinit var S_btn: Button
    private lateinit var A_btn:Button

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        binding= ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        S_btn = findViewById(R.id.submit_btn)
        R_btn = findViewById(R.id.register_btn)
        //A_btn=findViewById(R.id.Auth_button)
    }
}