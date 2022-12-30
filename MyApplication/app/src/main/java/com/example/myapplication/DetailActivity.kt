package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    var textOrder: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        textOrder = findViewById<TextView>(R.id.textOrder)
        var intent = intent
        textOrder!!.text = intent.getStringExtra("Order")
    }
}