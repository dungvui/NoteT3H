package com.example.notet3h

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FirstSplash : AppCompatActivity() {

    @Suppress("DEPRECATION")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_splash)

        val intent = Intent(this, SecondSplash::class.java)
        val intent2 = Intent(this, ThirdSplash::class.java)
        findViewById<ImageView>(R.id.slider2).setOnClickListener {
            startActivityForResult(intent, 10)
        }

        findViewById<Button>(R.id.nextbtn).setOnClickListener {
            startActivityForResult(intent, 10)
        }

        findViewById<ImageView>(R.id.slider3).setOnClickListener {
            startActivityForResult(intent2, 10)
        }

        findViewById<TextView>(R.id.skiptxt).setOnClickListener {
            startActivityForResult(intent, 10)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            finish()
        }
    }
}