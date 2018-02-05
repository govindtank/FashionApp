package com.fashionapp.red

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class DetailScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_screen)

        // get reference to btn_order button
        val btn_order : Button = findViewById(R.id.btn_order)

        // set on-click listener for btn_order button
        btn_order.setOnClickListener{
            val intent = Intent(this, SuccessScreen::class.java)
            startActivity(intent)
        }
    }
}