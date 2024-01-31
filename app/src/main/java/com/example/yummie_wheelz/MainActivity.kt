package com.example.yummie_wheelz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var actionBar = getSupportActionBar()
        actionBar?.hide()
        Thread.sleep(3000)
        val inte = Intent(this , login::class.java)
        startActivity(inte)
        finish()
    }
}