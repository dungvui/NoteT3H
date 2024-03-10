package edu.t3h.note

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondSplash : AppCompatActivity() {
    @Suppress("DEPRECATION")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_splash)

        val intent1 = Intent(this, FirstSplash::class.java)
        val intent2 = Intent(this, ThirdSplash::class.java)

        findViewById<ImageView>(R.id.btn_back).setOnClickListener {
            onBackPressed()
        }

        findViewById<TextView>(R.id.backtxt).setOnClickListener {
            onBackPressed()
        }

        findViewById<ImageView>(R.id.slider1).setOnClickListener {
            startActivity(intent1)
        }

        findViewById<TextView>(R.id.skiptxt).setOnClickListener {
            startActivityForResult(intent2, 100)
        }

        findViewById<ImageView>(R.id.slider3).setOnClickListener {
            startActivityForResult(intent2, 100)
        }

        findViewById<Button>(R.id.nextbtn).setOnClickListener {
            startActivityForResult(intent2, 100)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK) {
            setResult(Activity.RESULT_OK)
            finish()
        }
    }
}