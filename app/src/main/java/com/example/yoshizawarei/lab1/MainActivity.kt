package com.example.yoshizawarei.lab1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

import java.util.Random

class MainActivity : AppCompatActivity() {

    private var leftButton: Button? = null
    private var rightButton: Button? = null
    private var score: TextView? = null
    private var colorName: TextView? = null
    private val buttonLeftArray = ButtonLeftArray()
    private val buttonRightArray = ButtonRightArray()
    private var randomColor1: Int = 0
    private var randomColor2: Int = 0
    private var buttonLeftArray_color: Int = 0
    private var buttonRightArray_color: Int = 0

    private var buttonLeftArray_colorName: String? = null
    private var buttonRightArray_colorName: String? = null
    private var randomColorName: Int = 0
    private var scoreNum = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        leftButton = findViewById<View>(R.id.leftButton) as Button
        rightButton = findViewById<View>(R.id.rightButton) as Button
        score = findViewById<View>(R.id.score) as TextView
        colorName = findViewById<View>(R.id.colorName) as TextView
        randomColorGenerator()
    }

    fun randomColorGenerator() {
        val rand1 = Random()
        val rand2 = Random()
        randomColor1 = rand1.nextInt(buttonLeftArray.colorArr.size)
        randomColor2 = rand2.nextInt(buttonRightArray.colorArr.size)
        buttonLeftArray_color = buttonLeftArray.colorArr[randomColor1].color
        buttonRightArray_color = buttonRightArray.colorArr[randomColor2].color
        leftButton!!.setBackgroundColor(buttonLeftArray_color)
        rightButton!!.setBackgroundColor(buttonRightArray_color)

        while (randomColor1 == randomColor2) {
            rand1.nextInt()
        }

        randomColorName()
    }

    private fun randomColorName() {
        val rand3 = Random()
        randomColorName = rand3.nextInt(2)
        buttonLeftArray_colorName = buttonLeftArray.colorArr[randomColor1].colorName
        buttonRightArray_colorName = buttonRightArray.colorArr[randomColor2].colorName
        if (randomColorName == 1) {
            colorName!!.text = buttonLeftArray_colorName
        } else {
            colorName!!.text = buttonRightArray_colorName
        }
    }

    fun leftButtonClicked(view: View) {

        if (buttonLeftArray_colorName == colorName!!.text) {
            scoreNum++
            Toast.makeText(this, "Right!", Toast.LENGTH_SHORT).show()
        } else {
            scoreNum--
            Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show()
        }
        score!!.text = "Score: $scoreNum"
        randomColorGenerator()
    }

    fun rightButtonClicked(view: View) {

        if (buttonRightArray_colorName == colorName!!.text) {
            scoreNum++
            Toast.makeText(this, "Right!", Toast.LENGTH_SHORT).show()
        } else {
            scoreNum--
            Toast.makeText(this, "Wrong!", Toast.LENGTH_SHORT).show()
        }
        score!!.text = "Score: $scoreNum"
        randomColorGenerator()
    }

}
