package com.example.yummie_wheelz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val signup = findViewById<Button>(R.id.signupbut)
        signup.setOnClickListener(){
            val inte = Intent(this , signupapp::class.java)
            startActivity(inte)
        }
    }
}