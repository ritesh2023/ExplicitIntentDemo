package com.example.senddatatosecondactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.etName)
        val btnNext = findViewById<Button>(R.id.btnNext)
        btnNext.setOnClickListener {

            val mName : String
            mName = etName.text.toString()
            intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("NAME", mName)
            startActivity(intent)
        }
    }
}