package com.example.gaadiwala

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Otp_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.otp_page)

        val conf_btn1 = findViewById<Button>(R.id.confirm_btn)
        conf_btn1.setOnClickListener {
            val otp_11 = Intent(this, Home_page::class.java)
            startActivity(otp_11)
        }
        val back_arrow_sign = findViewById<ImageView>(R.id.back_btn_otp)
        back_arrow_sign.setOnClickListener {
            val bk_img_btn = Intent(this, Login_Page::class.java)
            startActivity(bk_img_btn)
        }
    }
}