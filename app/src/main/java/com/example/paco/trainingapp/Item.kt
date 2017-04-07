package com.example.paco.trainingapp

/**
 * Created by Paco on 5/4/17.
 */

fun getItems():List<Item> {
    return (1..10).map { Item(it.toLong(),"Title $it", "http://lorempixel.com/400/400/sports/$it/") }
}

data class Item (val id: Long,val title: String,val url:String)