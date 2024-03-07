package com.example.latihan_counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var textCount: TextView
    private lateinit var buttonPlus: Button
    private lateinit var buttonMin: Button

    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textCount = findViewById(R.id.textCount)
        buttonPlus = findViewById(R.id.buttonPlus)
        buttonMin = findViewById(R.id.buttonMin)

        textCount.text = counter.toString()

        buttonPlus.setOnClickListener {
            counter++
            textCount.text = counter.toString()
        }

        buttonMin.setOnClickListener {
            counter--
            textCount.text = counter.toString()
        }


    }
}