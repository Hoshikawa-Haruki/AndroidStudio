package com.example.androidkotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        } // main 레이아웃에 윈도우 인셋 적용
        val missMaximBtn = findViewById<View>(R.id.visibleBtn1)
        val imageView1 = findViewById<View>(R.id.missMaxim2023)

        missMaximBtn.setOnClickListener {
            if (imageView1.visibility == View.VISIBLE) {
                imageView1.visibility = View.INVISIBLE
            } else {
                imageView1.visibility = View.VISIBLE
            }
        }
    }
}