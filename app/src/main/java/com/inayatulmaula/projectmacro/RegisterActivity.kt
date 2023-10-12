package com.inayatulmaula.projectmacro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class RegisterActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var etUsername:EditText
    private lateinit var etEmail:EditText
    private lateinit var etPassword:EditText
    private lateinit var etNoHp:EditText
    private lateinit var etAlamat:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        etUsername = findViewById(R.id.et_username_Rgs)
        etEmail = findViewById(R.id.et_gmail_Rgs)
        etPassword = findViewById(R.id.et_password_Rgs)
        etNoHp = findViewById(R.id.et_nohp_Rgs)
        etAlamat = findViewById(R.id.et_alamat_Rgs)

        val btnRegister = findViewById<Button>(R.id.button_Register)
        btnRegister.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.button_Register -> {
                val intent = Intent(this@RegisterActivity, SplashScreenActivity::class.java)
                startActivity(intent)
            }
        }
    }
}