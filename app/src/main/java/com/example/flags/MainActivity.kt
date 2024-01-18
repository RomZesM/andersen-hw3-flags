package com.example.flags

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import com.example.flags.extensions.getImageFromURL

class MainActivity : AppCompatActivity() {

    var adress = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/Spis_Castle_116.jpg/2560px-Spis_Castle_116.jpg"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadImage();
    }

    fun loadImage(){
        Log.d("rmz", "load image")
        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.getImageFromURL(this, adress);
    }

}