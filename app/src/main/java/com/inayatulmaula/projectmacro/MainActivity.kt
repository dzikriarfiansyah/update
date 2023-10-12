package com.inayatulmaula.projectmacro

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNext : Button = findViewById(R.id.btnNext)
        btnNext.setOnClickListener(this)

        val btnskip : Button = findViewById(R.id.btnSkip)
        btnskip.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnNext -> {
                val intent = Intent(this@MainActivity, halamanDepan1::class.java)
                startActivity(intent)
            }

            R.id.btnSkip -> {
                val intent = Intent(this@MainActivity, halamanDepan1::class.java)
                startActivity(intent)
            }
        }
    }
}
