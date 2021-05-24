package com.dpag.sewa

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity



class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash_screen)
        Handler().postDelayed(object : Runnable {
            override fun run() {
                // TODO Auto-generated method stub
                val i = Intent(this@SplashScreen, HalamanLogin::class.java)
                startActivity(i) // menghubungkan activity splashscren ke main activity dengan intent


                //jeda selesai Splashscreen
                this.finish()
            }

            private fun finish() {
                // TODO Auto-generated method stub
            }
        }, splashInterval.toLong())
    }

    companion object {
        //Set waktu lama splashscreen
        private const val splashInterval = 2000
    }
}