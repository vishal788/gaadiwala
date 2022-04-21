package com.example.gaadiwala

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login_Page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_page)


        val login_btn1 = findViewById<Button>(R.id.proceed_btn)
        login_btn1.setOnClickListener {
            val login_11 = Intent(this, Otp_page::class.java)
            startActivity(login_11)
        }
    }
}