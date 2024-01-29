package com.my_firm.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.my_firm.myapplication.databinding.ActivityMainBinding
import android.content.Intent
import android.widget.Button




class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.text1
        binding.text2
        binding.amazfit
        binding.applewatch
        binding.galaxywatch
        binding.miwatch
        binding.fondApplewatch1
        binding.fondAmazfit
        binding.fondGalaxywatch
        binding.fondMiwatch
        binding.prixamazfit
        binding.prixapplewatch
        binding.prixgalaxywatch
        binding.prixmiwatch
        binding.textallseries
        binding.textproseries
        binding.textseries4
        binding.textseries7
        binding.textapplewatch
        binding.textgalaxywatch
        binding.textamazfit
        binding.textmiwatch
        binding.whiteRectangle2
        binding.whiteRectangle3
        binding.whiteRectangle4
        binding.whiteRectangle1
        val buttonapplewatch: Button = findViewById(R.id.buttonapplewatch)
        buttonapplewatch.setOnClickListener {
            val intent = Intent(this@MainActivity, ActivityAppleWatch::class.java)
            startActivity(intent)
        }
        val buttongalaxywatch: Button = findViewById(R.id.buttongalaxywatch)
        buttongalaxywatch.setOnClickListener {
            val intent = Intent(this@MainActivity, ActivityGalaxyWatch::class.java)
            startActivity(intent)
        }
        val buttonmiwatch: Button = findViewById(R.id.buttonmiwatch)
        buttonmiwatch.setOnClickListener {
            val intent = Intent(this@MainActivity, ActivityMiWatch::class.java)
            startActivity(intent)
        }
        val buttonamazfit: Button = findViewById(R.id.buttonamazfit)
        buttonamazfit.setOnClickListener {
            val intent = Intent(this@MainActivity, ActivityAmazfit::class.java)
            startActivity(intent)
        }
    }
}

