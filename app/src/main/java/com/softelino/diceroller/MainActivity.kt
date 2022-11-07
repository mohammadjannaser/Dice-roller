package com.softelino.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.text_view)
        findViewById<Button>(R.id.roll).setOnClickListener { rollDice() }
    }

     private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        textView.text = diceRoll.toString()
        textView.visibility = View.VISIBLE
    }


}


