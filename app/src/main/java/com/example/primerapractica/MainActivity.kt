package com.example.primerapractica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myTxT : String

        var myTextView = findViewById<TextView>(R.id.textView)
        var myEditText = findViewById<EditText>(R.id.edittext)
        var myButton = findViewById<button>(R.id.button)

        myButton.setOnClickListener {
            myTxT = myEditText.text.toString()
            myTextView.text = myTxT
        }
    }
}