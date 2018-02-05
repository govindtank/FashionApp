package com.fashionapp.red

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class GetStarted : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.get_started)

        // get reference to btn_get_started button
        val btn_get_started : Button = findViewById(R.id.btn_get_started)

        // set on-click listener for btn_get_started button
        btn_get_started.setOnClickListener{
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
        }
    }
}