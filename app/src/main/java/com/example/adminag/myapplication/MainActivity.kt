package com.example.adminag.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View) {
        // val myToast = Toast.makeText(this, message, duration);
        val myToast = Toast.makeText(this, "Bonjour, bienvenue", Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe (view: View){
        val showCountTextView = findViewById<TextView>(R.id.texView)

        val countString = showCountTextView.text.toString()

        var count: Int = Integer.parseInt(countString)
        count++

        showCountTextView.text = count.toString()
    }

    fun randomMe(view: View){
        val randomIntent : Intent = Intent(this, Main2Activity::class.java)

        val countString = texView.text.toString()

        val count = Integer.parseInt(countString)

        randomIntent.putExtra(Main2Activity.TOTAL_COUNT, count)
        startActivity(randomIntent)
    }


}
