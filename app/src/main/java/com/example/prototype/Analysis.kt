package com.example.prototype

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Analysis : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.analysis)

        val firstActButton = findViewById<Button>(R.id.return_button)
        firstActButton.setOnClickListener {
            val Intent = Intent(this,MainActivity::class.java)
            startActivity(Intent)
        }
        val pickphoto = findViewById<ImageButton>(R.id.imageButton)
        pickphoto.setOnClickListener{
            val intent = MXPickerBuilder().setMaxSize(3).createIntent(this)
            startActivityForResult(intent,0x22)
        }
    }
}