package com.jupiter.application.counter2_030222021

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    var counter : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv.setOnClickListener(this)
        img.setOnClickListener(this)

    }

    fun add(v:View){
       if(v == btn1){
           counter++
       }
        else if(v == btn2){
           counter+=2
       }
        else if(v == btn3){
           counter = 0
       }
        txv.text = counter.toString()

    }

    override fun onClick(v: View?) {
        counter++
        txv.text = counter.toString()
    }

}
