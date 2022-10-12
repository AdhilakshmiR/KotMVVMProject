package com.example.kotmvvmproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.View
import android.widget.Button
import com.example.kotmvvmproject.R

class ScreenA : AppCompatActivity() , View.OnClickListener{
    var button1:Button ?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen)


        button1=findViewById(R.id.button1)



    }


    override fun onClick(view: View?) {
        when(view?.id){
            R.id.button1->{
                // do some work here
                val i=Intent(this,ScreenB::class.java)
                startActivity(i)
            }
        }
    }
    override fun onStart() {
        super.onStart()
        Log.e("life cycle","On Start Activity- A")
    }

    override fun onStop() {
        super.onStop()
        Log.e("life cycle","On Stop Activity- A")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("life cycle","On destroy Activity- A")
    }
    override fun onResume(){
        super.onResume()
        Log.e("life cycle","On resume Activity- A")
    }
    override fun onPause(){
        super.onPause()
        Log.e("life cycle","On pause Activity- A")
    }
}