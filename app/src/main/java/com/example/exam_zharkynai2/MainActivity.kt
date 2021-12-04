package com.example.exam_zharkynai2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<AppCompatButton>(R.id.button)

        try {
            btn.setOnClickListener {
                val intent = Intent("activity_contact")
                startActivity(intent)
            }
        }catch (e:Exception){
            Log.e("Exception","Exception")
        }
    }
}