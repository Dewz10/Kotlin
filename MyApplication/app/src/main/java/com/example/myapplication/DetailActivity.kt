package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class DetailActivity : AppCompatActivity() {

    var textOrder: TextView? = null
    var editName: EditText? = null
    var editEmail: EditText? = null
    var btnConfirm: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        textOrder = findViewById<TextView>(R.id.textOrder)
        var intent = intent
        textOrder!!.text = intent.getStringExtra("Order")

        editName = findViewById(R.id.editName)
        editEmail = findViewById(R.id.editEmail)
        btnConfirm = findViewById(R.id.btnConfirm)
        btnConfirm!!.setOnClickListener {
            val dataIntent = Intent(this,ConfirmActivity::class.java)
            dataIntent.putExtra("Order",intent.getStringExtra("Order"))
            dataIntent.putExtra("Fullname",editName!!.text.toString())
            dataIntent.putExtra("Email",editEmail!!.text.toString())
            startActivity(dataIntent)
        }
    }
}