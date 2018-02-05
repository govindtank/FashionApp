package com.fashionapp.red

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class SuccessScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.success_screen)

        // get reference to btn_back_home button
        val btn_back_home : Button = findViewById(R.id.btn_back_home)

        // set on-click listener for btn_back_home button
        btn_back_home.setOnClickListener{
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
        }
    }
}