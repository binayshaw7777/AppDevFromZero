package com.binayshaw7777.appdevfromzero

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class AreaOfCircle : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_area_of_circle)

        val areaAnswer: TextView = findViewById(R.id.circleAreaAnswer)
        val radiusEditText: EditText = findViewById(R.id.radiusEditText)
        val calculate: Button = findViewById(R.id.calculate)

        calculate.setOnClickListener {
            val radius = radiusEditText.text.toString().toDoubleOrNull() ?: 0.0
            val area = Math.PI * radius * radius
            areaAnswer.text = "Area of Circle is $area"
        }
    }
}