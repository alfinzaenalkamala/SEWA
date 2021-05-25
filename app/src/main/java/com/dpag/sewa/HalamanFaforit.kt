package com.dpag.sewa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_halaman_faforit.*
import kotlinx.android.synthetic.main.activity_landing.*

class HalamanFaforit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_faforit)
        forit.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, HalamanLogin::class.java)
            startActivity(intent);
        }
    }
}