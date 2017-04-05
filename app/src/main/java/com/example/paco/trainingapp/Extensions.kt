package com.example.paco.trainingapp

import android.content.Context
import android.widget.Toast

/**
 * Created by Paco on 5/4/17.
 */

fun Context.toast(text: CharSequence, len: Int = Toast.LENGTH_SHORT) = Toast.makeText(this, text, len).show()