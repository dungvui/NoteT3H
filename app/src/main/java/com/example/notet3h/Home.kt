package com.example.notet3h

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

//    override fun onBackPressed() {
//        super.onBackPressed()
//        finishAffinity()
//        val intent = Intent(this, Home::class.java)
//        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
//        startActivity(intent)
//    }
}