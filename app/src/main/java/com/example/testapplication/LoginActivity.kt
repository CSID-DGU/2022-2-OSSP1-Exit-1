package com.example.testapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.testapplication.databinding.ActivityLoginBinding
import retrofit2.Call
import retrofit2.Response

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    private val api = APIS.create()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val ID = binding.loginID
        val Password = binding.loginPassword

        binding.signBtn.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        binding.loginBtn.setOnClickListener {
            if (ID.text.isNotEmpty() && Password.text.isNotEmpty()) {
                api.signin(
                    ID.text.toString(),
                    Password.text.toString()
                ).enqueue(object : retrofit2.Callback<UserSigninModel> {
                    override fun onResponse(
                        call: Call<UserSigninModel>,
                        response: Response<UserSigninModel>
                    ) {
                        if (response.body()?.result.toString().equals("success")) {
                            Log.d("loginsuccess", "${response.body()}")
                            Toast.makeText(applicationContext, "로그인 성공!", Toast.LENGTH_SHORT).show()
                            val intent = Intent(applicationContext, MainActivity::class.java)
                            startActivity(intent)
                        } else {
                            Toast.makeText(
                                applicationContext,
                                response.body()?.result.toString(),
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }

                    override fun onFailure(call: Call<UserSigninModel>, t: Throwable) {
                        Log.d("loginfail", "asdf")
                    }

                })
            } else {
                if (ID.text.isEmpty()) {
                    Toast.makeText(applicationContext, "아이디를 입력하주세요", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(applicationContext, "비밀번호를 입력해주세요", Toast.LENGTH_SHORT).show()
                }
            }


        }
    }
}