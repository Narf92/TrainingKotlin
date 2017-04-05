package com.example.paco.trainingapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener { toast(text = editText.text) }

        val items = listOf(Item("Title1", "Url1"), Item("Title2", "Url2"))

        val sorted = items
                .sortedBy (Item::title )
                .filter { it.url.isNotEmpty() }
                .map(Item::title)
    }
}
