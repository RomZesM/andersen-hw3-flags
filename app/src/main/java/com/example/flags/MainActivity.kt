package com.example.flags

import android.graphics.BlurMaskFilter
import android.graphics.BlurMaskFilter.Blur
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.util.Log
import android.view.RoundedCorner
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.widget.ContentFrameLayout
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.example.flags.extensions.Flags
import com.example.flags.extensions.getImageFromURL


class MainActivity : AppCompatActivity() {

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



 }
