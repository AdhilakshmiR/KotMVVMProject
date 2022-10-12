package com.example.kotmvvmproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.kotmvvmproject.R
import com.example.kotmvvmproject.viewmodel.Userdetailsviewmodel
import com.example.kotmvvmproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var viewmodel:Userdetailsviewmodel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
//        viewmodel=ViewModelProvider(this).get(Userdetailsviewmodel::class.java)
//        binding.viewmodel=viewmodel

        binding.txtUsername.text="Adhilakshmi"
        binding.txtEmail.text="nidumolu.adhilakshmi@gmail.com"
        binding.saveBtn.setOnClickListener {

           // Toast(this,"button clicked ",LENGTH_SHORT).show()
            it!!.isEnabled=false;
            it!!.isClickable=false
            Log.e("button click","button is disabled" +
                    "activity");
        }

        binding.lifecycleOwner=this



    }
}