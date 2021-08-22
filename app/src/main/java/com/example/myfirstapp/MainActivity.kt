package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, "Hello, Toast!", Toast.LENGTH_SHORT)

        myToast.show()
    }

    fun countMe(view: View) {
        var text: TextView = findViewById(R.id.textView) as TextView
        val countString = text.text.toString()
        var count = Integer.parseInt(countString)
        count++

        text.text = count.toString()
    }
}