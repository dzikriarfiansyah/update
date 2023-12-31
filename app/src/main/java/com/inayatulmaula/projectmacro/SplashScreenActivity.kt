package com.inayatulmaula.projectmacro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class SplashScreenActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val btnback: Button = findViewById(R.id.button_back)
        btnback.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null){
            when(v.id){
                R.id.button_back -> {
                    val pindahIntent = Intent(this@SplashScreenActivity, LoginActivity::class.java)
                    startActivity(pindahIntent)
                }
            }
        }
    }
}