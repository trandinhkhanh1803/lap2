package com.example.diceroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

//        rollButton.setOnClickListener {
//            val resultTextView: TextView = findViewById(R.id.textView)
//            resultTextView.text = "6"
//
//        }
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        // tao xuc xac co 6 mat
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)
        /** dung if-else */
//        if (diceRoll == 1) {
//            diceImage.setImageResource(R.drawable.dice_1)
//        } else if (diceRoll == 2) {
//            diceImage.setImageResource(R.drawable.dice_2)
//        } else if (diceRoll == 3) {
//            diceImage.setImageResource(R.drawable.dice_3)
//        } else if (diceRoll == 4) {
//            diceImage.setImageResource(R.drawable.dice_4)
//        } else if (diceRoll == 5) {
//            diceImage.setImageResource(R.drawable.dice_5)
//        } else if (diceRoll == 6) {
//            diceImage.setImageResource(R.drawable.dice_6)
//        }

        /** dung when */
//        when (diceRoll) {
//            1 -> diceImage.setImageResource(R.drawable.dice_1)
//            2 -> diceImage.setImageResource(R.drawable.dice_2)
//            3 -> diceImage.setImageResource(R.drawable.dice_3)
//            4 -> diceImage.setImageResource(R.drawable.dice_4)
//            5 -> diceImage.setImageResource(R.drawable.dice_5)
//            6 -> diceImage.setImageResource(R.drawable.dice_6)
//
//        }
        //xac dinh id tai nguyen su dung
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        // cap nhat imageView voi id tai nguyen
        diceImage.setImageResource(drawableResource)
        //cap nhat mo ta noi dung
        diceImage.contentDescription = diceRoll.toString()
    }
}

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}