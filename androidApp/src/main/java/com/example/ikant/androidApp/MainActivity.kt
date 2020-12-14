package com.example.ikant.androidApp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.ikant.shared.Greeting

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "iKant"

        val unmotivational_phrase: TextView = findViewById(R.id.unmotivational_phrase)
        val unmotivate_me_button: Button = findViewById(R.id.unmotivational_button)

        val unmotivatorMachine = UnmotivatorMachine()

        unmotivate_me_button.setOnClickListener {
            unmotivational_phrase.text = unmotivatorMachine.unmotivate();
        }
    }
}
