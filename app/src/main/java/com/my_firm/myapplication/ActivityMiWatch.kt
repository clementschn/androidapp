package com.my_firm.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityMiWatch : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mi_watch)
        val buttonreturn: Button = findViewById(R.id.buttonreturn)
        buttonreturn.setOnClickListener {
            val intent = Intent(this@ActivityMiWatch, MainActivity::class.java)
            startActivity(intent)
        }
    }
}