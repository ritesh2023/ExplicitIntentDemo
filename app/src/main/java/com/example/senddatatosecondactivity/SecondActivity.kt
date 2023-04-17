package com.example.senddatatosecondactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val tvName = findViewById<TextView>(R.id.tvName)
       // tvName.text = intent.extras?.getString("NAME")? : "No message found"
        tvName.text = intent.getStringExtra("NAME")?: "No message found"
    }
}