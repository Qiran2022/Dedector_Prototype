package com.example.prototype

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstActButton = findViewById<Button>(R.id.button)
        firstActButton.setOnClickListener {
            val Intent = Intent(this,camera_activity::class.java)
            startActivity(Intent)
        }

        val secondActButton = findViewById<Button>(R.id.button2)
        secondActButton.setOnClickListener {
            val Intent = Intent(this,MainActivity3::class.java)
            startActivity(Intent)
        }

        val thirdActButton = findViewById<Button>(R.id.button3)
        thirdActButton.setOnClickListener {
            val Intent = Intent(this,MainActivity4::class.java)
            startActivity(Intent)
        }

    }
}