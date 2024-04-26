package com.example.dogapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.copyndpaste.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Declaring the views
        val enter = findViewById<Button>(R.id.button)
        val dickyTheDogAssistantApplication = findViewById<TextView>(R.id.textView3)

        enter.setOnClickListener{
            intent = Intent(this, DogApp2::class.java)
            startActivity(intent)
        }


    }
}