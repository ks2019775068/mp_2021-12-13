package com.example.introduceapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val go_intent = findViewById(R.id.button) as Button
        go_intent.setOnClickListener {
            val intent = Intent(this@MainActivity, Contents::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener {
            var intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/ks2019775068/Mobile-Programming"))
            startActivity(intent)
        }

        imageView2.setOnClickListener {
            var t1 = Toast.makeText(this, "안녕하세요🤗", Toast.LENGTH_SHORT)
            t1.show()
        }
    }
}
