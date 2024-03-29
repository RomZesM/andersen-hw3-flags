package com.example.flags

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.flags.extensions.Flags
import com.example.flags.extensions.getImageFromURLOverride
import java.security.AccessController.getContext


class MainActivity : AppCompatActivity() {
    val test_adress = "https://upload.wikimedia.org/wikipedia/commons/1/13/Weil_am_Rhein_-_Dreil%C3%A4nderbr%C3%BCcke10.jpg"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setDataIntoLayout()

    }

    fun setDataIntoLayout(){
        //get linear from
        val layMain : LinearLayout = findViewById(R.id.flag_linear_layout)
        for(i in 0..layMain.childCount - 1){
            val layWithFlag : LinearLayout = layMain.getChildAt(i) as LinearLayout;
            val layImage : ImageView = layWithFlag.getChildAt(0) as ImageView;
            val layText : TextView = layWithFlag.getChildAt(1) as TextView;
            layImage.getImageFromURLOverride(this, Flags.flagsArr[i].adress, dpToInt(100), dpToInt(50))
            layText.setText(Flags.flagsArr[i].title)
        }
    }


    fun dpToInt(dp : Int) : Int{
        val scale: Float = resources.getDisplayMetrics().density
        val pixels = (dp * scale + 0.5f).toInt()
        return pixels
    }
//    fun createLinearLayout(){
//        val existedLinearLayout = findViewById<LinearLayout>(R.id.flag_linear_layout)
//        //create layout for text and image insertion
//        val linLayout : LinearLayout = LinearLayout(this)
//        //create ImageView
//        val imageView : ImageView = ImageView(this)
//        imageView.maxWidth = 400
//        imageView.maxHeight = 250
//        imageView.adjustViewBounds = true;
//        imageView.getImageFromURL(this, test_adress);
//
//        //insert imageView into xml
//        existedLinearLayout.addView(imageView);
//    }


 }
