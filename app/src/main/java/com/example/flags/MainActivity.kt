package com.example.flags

import android.graphics.BlurMaskFilter
import android.graphics.BlurMaskFilter.Blur
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.RoundedCorner
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.flags.extensions.getImageFromURL


class MainActivity : AppCompatActivity() {

    var adress = "https://upload.wikimedia.org/wikipedia/commons/thumb/1/12/Spis_Castle_116.jpg/2560px-Spis_Castle_116.jpg"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadFlags()
    }

    fun loadFlags(){
        val img = findViewById<ImageView>(R.id.flag_image);
        val img2 = findViewById<ImageView>(R.id.flag_image2)
        img.getImageFromURL(this, adress)
        img2.getImageFromURL(this, adress)


    }

//    fun loadImage(){
//        Log.d("rmz", "load image")
//        val imageView = findViewById<ImageView>(R.id.imageView)
//        imageView.getImageFromURL(this, adress);
//    }

//    fun loadImage2(){
//        Log.d("rmz", "load image")
//        val imageView = findViewById<ImageView>(R.id.imageViewBottom)
        //basic usage
//        Glide.with(this)
//            .load(adress)
//            .into(imageView);
        //resize image (not image view)
//            Glide.with(this)
//                .load(adress)
//                .override(100, 50)
//                .into(imageView)

        //make rounded corners for image
//            Glide.with(this)
//                .load(adress)
//                .transform(RoundedCorners(20))
//                .into(imageView)

        //make corcle crop of image
//        Glide.with(this)
//            .load(adress)
//            .transform(CircleCrop())
//            .into(imageView)
    //}


 }
