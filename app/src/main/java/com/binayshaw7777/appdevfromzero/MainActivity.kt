package com.binayshaw7777.appdevfromzero

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.binayshaw7777.appdevfromzero.ui.theme.AppDevFromZeroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val context = this.applicationContext
        setContent {
            AppDevFromZeroTheme {

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MaterialTheme.colorScheme.background)
                        .padding(horizontal = 20.dp, vertical = 40.dp)
                ) {

                    Text(text = "Welcome to App Dev From Zero", style = MaterialTheme.typography.titleMedium.copy(color = MaterialTheme.colorScheme.onBackground))

                    Spacer(modifier = Modifier.height(40.dp))


                    Button(onClick = {
                        val intent = Intent(context, AreaOfCircle::class.java)
                        startActivity(intent)
                    }) {
                        Text(text = "Go to Area of Circle")
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(onClick = {
                        val intent = Intent(context, SayHello::class.java)
                        startActivity(intent)
                    }) {
                        Text(text = "Go to Say Hello")
                    }
                }
            }
        }
    }
}