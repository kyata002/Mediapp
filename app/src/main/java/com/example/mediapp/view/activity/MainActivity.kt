package com.example.mediapp.view.activity

import android.content.Context
import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import com.example.mediapp.R


class MainActivity : AppCompatActivity() {
    var context: Context = this;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Timer = object : CountDownTimer(2000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
            }

            override fun onFinish() {
                HomeActivity.start(context)
                finish()
            }
        }.start()

    }

}