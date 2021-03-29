package com.jupiter.application.counter2_030222021

import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener, View.OnLongClickListener, View.OnTouchListener {

    var counter : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv.setOnClickListener(this)
        img.setOnClickListener(this)
        btn4.setOnClickListener(object:View.OnClickListener{
            override fun onClick(v: View?) {
                counter = (1..100).random()
                txv.text = counter.toString()
            }
        })

       txv.setOnLongClickListener(object:View.OnLongClickListener{
            override fun onLongClick(v: View?): Boolean {
                counter+=2
                txv.text = counter.toString()
                return true
            }
        })

        txv2.setOnTouchListener(object :View.OnTouchListener{
            override fun onTouch(v: View?, event: MotionEvent?): Boolean {
                //txv2.text="TEST OK"
                if(event?.action == MotionEvent.ACTION_DOWN){
                    txv2.text="TEST OK_DOWN(Press)"
                }
                else if(event?.action == MotionEvent.ACTION_UP){
                    txv2.text="TEST OK_UP(Release)"
                }
                return true
            }
        })

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
       if(v == txv){
           counter++
       }
        else if(v == img){
           counter+=2
       }
       /* else if(v == btn4){
           counter = (0..100).random()
           txv.text = counter.toString()

       }*/
        txv.text = counter.toString()
    }

    override fun onLongClick(v: View?): Boolean {
        counter+=2
        txv.text = counter.toString()
        return true
    }

    override fun onTouch(v: View?, event: MotionEvent?): Boolean {
        TODO("Not yet implemented")
    }


}
