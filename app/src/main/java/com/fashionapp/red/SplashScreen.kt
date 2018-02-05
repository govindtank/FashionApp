package com.fashionapp.red

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import android.content.Intent

class SplashScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        // create function for timer to change activity
        val timer = Timer()
        timer.schedule(object : TimerTask() {

            override fun run() {
                startActivity(Intent(this@SplashScreen, GetStarted::class.java))
            }

        }, 5000)

    }
}
