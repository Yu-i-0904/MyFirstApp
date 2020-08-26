package com.example.callapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        morningButton.setOnClickListener {
            greetingText.text = getString(R.string.good_morning_text)
        }
        afternoonButton.setOnClickListener {
            greetingText.text = getString(R.string.good_afternoon_text)
        }
        eveningButton.setOnClickListener {
            greetingText.text = getString(R.string.good_evening_text)
        }
    }
}