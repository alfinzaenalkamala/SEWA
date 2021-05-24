package com.dpag.sewa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_landing.*


class Landing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landing)
        lan_login.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, HalamanLogin::class.java)
            startActivity(intent);
    }
        lan_register.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, HalamanRegistrasi::class.java)
            startActivity(intent);
        }
}
}