package com.example.diceroll

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val resultText :TextView=findViewById(R.id.txt1)
//        resultText.text = "6"

        val rollButton: Button = findViewById(R.id.btn1);
        rollButton.setOnClickListener {
            val toast = Toast.makeText(this, "Nhấn tiếp nào!",Toast.LENGTH_SHORT)
            toast.show()
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
        val resultTextView: TextView = findViewById(R.id.txt1)
        resultTextView.text = rollDice.toString()
    }
}