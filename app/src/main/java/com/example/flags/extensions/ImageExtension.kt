package com.example.flags.extensions

import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

fun ImageView.getImageFromURL(activity : AppCompatActivity, adress : String){
    Glide.with(activity).asDrawable().load(adress).into(this)
}