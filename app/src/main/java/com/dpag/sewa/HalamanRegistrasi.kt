package com.dpag.sewa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_halaman_login.*

class HalamanRegistrasi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_registrasi)
        register.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, HalamanLogin::class.java)
            startActivity(intent);
        }
    }
}