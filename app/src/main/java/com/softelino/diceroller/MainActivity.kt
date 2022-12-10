package com.softelino.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.text_view)
        imageView = findViewById(R.id.image_view)

        findViewById<Button>(R.id.roll).setOnClickListener { rollDiceImage() }
    }

     private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        textView.text = diceRoll.toString()
        textView.visibility = View.VISIBLE
    }

    private fun rollDiceImage() {

        // select the resource based on the selected rolled dice.
        val resource: Int = when (Dice(6).roll()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> throw Exception ("Invalid dice number")
        }
        // set the resource image to the image of ui
        imageView.setImageResource(resource)

    }
}


