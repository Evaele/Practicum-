package com.example.practicum

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainScreen : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        val DayInput = findViewById<EditText>(R.id.txtDay)
        val MorningInput = findViewById<EditText>(R.id.txtMorningTime)
        val AfternoonInput = findViewById<EditText>(R.id.txtAfternoonTime)
        val ActivityNotesInput = findViewById<EditText>(R.id.txtActivityNotes)

        findViewById<Button>(R.id.saveButton).setOnClickListener {
            screenTime[0] = DayInput.text.toString().toInt()
            screenTime[1] = MorningInput.text.toString().toInt()
            screenTime[2] = AfternoonInput.text.toString().toInt()
            screenTime[3] = ActivityNotesInput.text.toString().toInt()
            Toast.makeText(this, "Data saved successfully!", Toast.LENGTH_SHORT).show()
        }
        findViewById<Button>(R.id.clearButton).setOnClickListener {
            screenTime.


