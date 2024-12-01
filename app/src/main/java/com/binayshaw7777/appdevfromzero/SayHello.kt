package com.binayshaw7777.appdevfromzero

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.binayshaw7777.appdevfromzero.util.TimeUtil

class SayHello : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_say_hello)

        // Variable declarations
        val name: EditText = findViewById(R.id.yourNameEdiText)
        val createGreetingMessage: Button = findViewById(R.id.createGreetingMessage)
        val greetingMessage: TextView = findViewById(R.id.greetingMessage)

        // What to do when the button is clicked
        createGreetingMessage.setOnClickListener {
            val yourName = name.text.toString()
            val prefixMessage: String = TimeUtil.getGreeting(null)
            greetingMessage.text = "$prefixMessage, $yourName!"
        }
    }
}