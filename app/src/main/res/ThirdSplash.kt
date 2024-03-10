package edu.t3h.note

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.result.ActivityResult
import androidx.appcompat.app.AppCompatActivity

class ThirdSplash : AppCompatActivity() {
    private var intent1: Intent? = null
    private var intent2: Intent? = null

    @Suppress("DEPRECATION")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_splash)

        intent1 = Intent(this, FirstSplash::class.java)
        intent2 = Intent(this, SecondSplash::class.java)

        findViewById<ImageView>(R.id.btn_back).setOnClickListener {
            onBackPressed()
        }

        findViewById<TextView>(R.id.backtxt).setOnClickListener {
            onBackPressed()
        }

        findViewById<ImageView>(R.id.slider2).setOnClickListener {
            startActivity(intent2)
        }

        findViewById<ImageView>(R.id.slider1).setOnClickListener {
            startActivity(intent1)
        }

        val intent3 = Intent(this, Home::class.java)
        findViewById<Button>(R.id.startbtn).setOnClickListener {
            setResult(Activity.RESULT_OK)
            startActivity(intent3)
            finish()
        }
    }
}