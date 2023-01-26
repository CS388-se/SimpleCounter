package com.example.simplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val button = findViewById<Button>(R.id.button)
        val upgradeButton = findViewById<Button>(R.id.upgradeBtn)
        var counter = 0
        var step = 1

        upgradeButton.setOnClickListener {
            upgradeButton.visibility = View.INVISIBLE
            step = 2
        }

        button.setOnClickListener {
            counter += step
            textView.text = counter.toString()
            if (counter == 100) {
                upgradeButton.visibility = View.VISIBLE
            }
        }
    }
}