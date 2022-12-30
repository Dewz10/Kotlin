package com.example.myapplicationa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var movies = arrayOf(
        "Riverdale season 1",
        "Riverdale season 2",
        "Riverdale season 3",
        "Riverdale season 4",
        "Riverdale season 5"
    )
    var recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recycleView = findViewById(R.id.recyclerView)

    }
}