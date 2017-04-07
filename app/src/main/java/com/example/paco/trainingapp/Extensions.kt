package com.example.paco.trainingapp

import android.content.Context
import android.support.annotation.LayoutRes
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import com.squareup.picasso.Picasso

/**
 * Created by Paco on 5/4/17.
 */

fun Context.toast(text: CharSequence, len: Int = Toast.LENGTH_SHORT) = Toast.makeText(this, text, len).show()

fun ViewGroup.inflate(layoutRes: Int): View {
    return LayoutInflater.from(context).inflate(layoutRes, this, false)
}

fun ImageView.loadUrl(url: String){
    Picasso.with(context).load(url).into(this)
}