package com.sunnyweather.android

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

//登录页面的逻辑代码

class Login: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val addButton: Button = findViewById(R.id.btn_login)

        addButton.setOnClickListener {
            val intent =   Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}