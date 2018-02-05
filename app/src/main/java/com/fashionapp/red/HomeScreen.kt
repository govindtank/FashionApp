package com.fashionapp.red

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class HomeScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_screen)

        // get reference to swimsuit_btn button
        val swimsuit_btn : Button = findViewById(R.id.swimsuit_btn)

        // set on-click listener for swimsuit_btn button
        swimsuit_btn.setOnClickListener{
            val intent = Intent(this, DetailScreen::class.java)
            startActivity(intent)
        }
    }
}