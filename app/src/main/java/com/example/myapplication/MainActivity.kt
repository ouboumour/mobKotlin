    package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

    class MainActivity : AppCompatActivity() {

        var button : Button? = null
        var textView : TextView? = null
        //var editText : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button_validation)
        textView = findViewById(R.id.textView)

        button?.setOnClickListener {
            textView?.text="cc"
        }
    }
}