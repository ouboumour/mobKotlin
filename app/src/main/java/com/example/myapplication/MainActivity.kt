    package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

    class MainActivity : AppCompatActivity() {

        var button : Button? = null
        var textView : TextView? = null
        var editText : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        Log.d("MainActivity", "Je passe dans le onCreate")
        button = findViewById(R.id.button_validation)
        textView = findViewById(R.id.textView)
        editText = findViewById<EditText>(R.id.monPasswd)

        // intent sur la bare de recherche puis le lien avec guide ..

        button?.setOnClickListener {
            val texteDeLEditText = editText?.text
            textView?.text = texteDeLEditText

            val text = "Hello toast!"
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }
    }
}