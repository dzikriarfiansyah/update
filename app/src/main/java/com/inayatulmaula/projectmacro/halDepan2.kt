package com.inayatulmaula.projectmacro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class halDepan2 : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hal_depan2)

        val btnNext : Button = findViewById(R.id.btnNext)
        btnNext.setOnClickListener(this)

        val btnSkip : Button = findViewById(R.id.btnSkip)
        btnSkip.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btnNext -> {
                val intent = Intent(this@halDepan2, halDepan3::class.java)
                startActivity(intent)
            }

            R.id.btnSkip -> {
                val intent = Intent(this@halDepan2, LoginActivity::class.java)
                startActivity(intent)
            }
        }
    }
}