package com.dpag.sewa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_landing.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonfaf.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, Chat::class.java)
            startActivity(intent);
        }
        list_terdekat.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, HalamanTerdekat::class.java)
            startActivity(intent);
        }
        lis_faforit.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, HalamanFaforit::class.java)
            startActivity(intent);
        }
        konten1.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, Detail::class.java)
            startActivity(intent);
        }
        konten2.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, Detail::class.java)
            startActivity(intent);
        }
        konten3.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, Detail::class.java)
            startActivity(intent);
        }
        konten4.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, Detail::class.java)
            startActivity(intent);
        }
    }
}