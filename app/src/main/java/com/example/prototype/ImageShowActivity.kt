package com.example.prototype

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class ImageShowActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_show)

        val picturePath= intent.getStringExtra("path")
        Log.e("debug", picturePath.toString())

        val textView = findViewById<TextView>(R.id.textView)
        textView.setText(picturePath.toString())
        val iv = findViewById<ImageView>(R.id.imageView)

        val bm = BitmapFactory.decodeFile(picturePath.toString())
        val createScaledBitmap = Bitmap.createScaledBitmap(bm, 200, 200, true)
        iv.setImageBitmap(createScaledBitmap)
        iv.setScaleType(ImageView.ScaleType.FIT_CENTER);
    }
}
