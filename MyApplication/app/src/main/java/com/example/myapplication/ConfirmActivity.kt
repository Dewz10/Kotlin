package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ConfirmActivity : AppCompatActivity() {

    var showOrder: TextView? = null
    var showName: TextView? = null
    var showEmail: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm)
        showOrder = findViewById(R.id.showOrder)
        showName = findViewById(R.id.showName)
        showEmail = findViewById(R.id.showEmail)
        var intent = intent
        showOrder!!.text = intent.getStringExtra("Order")
        showOrder!!.text = intent.getStringExtra("Fullname")
        showOrder!!.text = intent.getStringExtra("Email")
    }
}