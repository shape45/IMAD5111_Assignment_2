package com.example.dogapplication

import android.annotation.SuppressLint
import android.content.Intent.ShortcutIconResource
import android.graphics.drawable.AnimatedImageDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.copyndpaste.R

class DogApp2 : AppCompatActivity() {
    private var petHealth = 100
    private var petHunger = 50
    private var petCleanliness = 50

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dog_app2)

        //Get the buttons and text views
        val imageView = findViewById<ImageView>(R.id.imageView)
        val feedButton = findViewById<TextView>(R.id.feedButton)
        val cleanButton = findViewById<Button>(R.id.cleanButton)
        val happyButton = findViewById<Button>(R.id.happyButton)
        val textView = findViewById<TextView>(R.id.textView)
        val txtHungry = findViewById<TextView>(R.id.textView2)
        val txtClean = findViewById<TextView>(R.id.textView4)
        val txtHappy = findViewById<TextView>(R.id.textView5)

        //Set the intial text values
        txtHungry.setText(petHunger.toString())
        txtClean.setText(petCleanliness.toString())
        txtHappy.setText(petHealth.toString())

        //Handle button clicks
        feedButton.setOnClickListener {
            petHunger -= 10
            petHealth += 10
            petHunger += 5
            txtHungry.setText(petHunger.toString())
            animateImageChange(imageView, R.drawable.eating_dog_icon)
        }

        cleanButton.setOnClickListener {
            petCleanliness += 10
            petHealth += 10

            txtClean.setText(petCleanliness.toString())
            animateImageChange(imageView, R.drawable.clean_dog_icon)
        }

        happyButton.setOnClickListener {
            petHealth += 10
            petHunger += 5
            petCleanliness += 5
            txtHappy.setText(petHealth.toString())
            animateImageChange(imageView, R.drawable.happy_dog_icon)
        }
    }

    private fun animateImageChange(imageView: ImageView, newImageResource: Int) {
        val animation = AlphaAnimation(0.0f, 1, 0f)
        if (animation != null) {
            animation.duration = 500
            animation.fillAfter = true
        }
        imageView.startAnimation(animation)
        imageView.setImageResource(newImageResource)
    }

    private fun AlphaAnimation(fl: Float, i: Int, fl1: Float): Animation? {

        return TODO("Provide the return value")
    }

}