package com.example.practicum

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.Intents
import android.widget.Button

class MainActivity : AppCompatActivity() {
    class mainscreen {

    }
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splashactivity)
        val btnStart= findViewById<Button>(R.id.btnStart)
        val btnExist=findViewById<Button>(R.id.btnExist)

        btnStart?.setOnClickListener {
            val  intent = Intent(this,mainscreen::class.java)
       }
   }
}
