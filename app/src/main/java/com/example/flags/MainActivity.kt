package com.example.flags

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.flags.extensions.Flags
import com.example.flags.extensions.getImageFromURL


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
            layImage.getImageFromURL(this,Flags.flagsArr[i].adress)
            layText.setText(Flags.flagsArr[i].title)
        }
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
