package com.my.responsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var btnmasuk: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnmasuk = findViewById(R.id.btnmasuk)
        btnmasuk.setOnClickListener {
            var masuk = Intent(this@MainActivity, HomeActivity::class.java)
            startActivity(masuk)
        }
    }
}