package com.example.kotmvvmproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kotmvvmproject.R

class ScreenB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen_b)
    }

    override fun onStart() {
        super.onStart()
        Log.e("life cycle","On Start Activity- B")
    }

    override fun onStop() {
        super.onStop()
        Log.e("life cycle","On Stop Activity- B")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("life cycle","On destroy Activity- B")
    }
    override fun onResume(){
        super.onResume()
        Log.e("life cycle","On resume Activity- B")
    }
    override fun onPause(){
        super.onPause()
        Log.e("life cycle","On pause Activity- B")
    }
}