package com.example.testapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity(){
    private lateinit var btn_login:Button
    private lateinit var btn_signup:Button
    private lateinit var btn_findpwd:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login=findViewById(R.id.login_btn)
        btn_signup=findViewById(R.id.sign_btn)
        btn_findpwd=findViewById(R.id.find_pwd_btn)

        btn_signup.setOnClickListener{
            val intent=Intent(this, RegisterActivity::class.java)
            startActivity(intent)
            //finish()
        }

        btn_login.setOnClickListener{
            val intent=Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}