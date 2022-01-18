package com.example.diceroll

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




        val rollButton: Button = findViewById(R.id.btn1);
        rollButton.setOnClickListener {

            rollDice()
        }


    }
    class Dice(private val numSide:Int){
        fun roll(): Int{
            return (1..numSide).random()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val rollDice = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)



      val drawableResource  =  when( rollDice){
            1   -> R.drawable.dice_1
            2   ->  R.drawable.dice_2
            3   ->  R.drawable.dice_3
            4   -> R.drawable.dice_4
            5   -> R.drawable.dice_5
            else   -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)

        diceImage.contentDescription = rollDice.toString()
    }
}