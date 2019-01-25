package com.example.adam.myfirstkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    fun upValue(view: View){
        val myToast = Toast.makeText(this, "Zwiększam", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun downValue(view: View){
        val myToast = Toast.makeText(this, "Zmniejszam", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countUp(view: View){
        val showCountTextView = findViewById<TextView>(R.id.counterView)
        val countString = showCountTextView.text.toString()

        var count: Int = Integer.parseInt(countString)
        count++

        showCountTextView.text = count.toString()
        upValue(view)
    }

    fun countDown(view: View){
        val showCountTextView = findViewById<TextView>(R.id.counterView)
        val countString = showCountTextView.text.toString()

        var count: Int = Integer.parseInt(countString)
        count--

        showCountTextView.text = count.toString()
        downValue(view)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
