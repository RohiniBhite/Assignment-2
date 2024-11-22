package com.example.sampleapp

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var sampleTextView:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sampleTextView=findViewById(R.id.testTextview)
        sampleTextView=findViewById(R.id.testTextview)
        Log.i(tag"MAIN_ACTIVITY","onCreat called")
    }

   override fun onstart(){
    super.onStart ()
       Log.i(tag"MAIN_ACTIVITY",msg"onCreat called")
    }
    override fun onResume(){
        super.onResume ()
        Log.i(tag"MAIN_ACTIVITY",msg"onCreat called")
    }
    override fun onPause() {
        super.onPause()
        Log.i(tag"MAIN_ACTIVITY", msg"onCreat called")
    }
    override fun onStop() {
        super.onStop()
        Log.i(tag"MAIN_ACTIVITY", msg"onCreat called")
    }
