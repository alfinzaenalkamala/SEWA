package com.dpag.sewa

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_halaman_login.*
import kotlinx.android.synthetic.main.content_detail.*


class ContentDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_detail)
        bayar.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, payment::class.java)
            startActivity(intent);
        }
        chat.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, Chat::class.java)
            startActivity(intent);
        }

    }
}