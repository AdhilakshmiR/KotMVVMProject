package com.example.kotmvvmproject.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.kotmvvmproject.api.ApiInterface
import com.example.kotmvvmproject.model.UserDetails

class UserdataRepository(private val apiservice:ApiInterface) {


    private val mutablellistobj= MutableLiveData<UserDetails>()
    val livedataobj:LiveData<UserDetails>
    get() = mutablellistobj


    suspend fun getUserdata(){
       val result= apiservice.getusersdata("20")
       if(result?.body()!=null){
         mutablellistobj.postValue(result.body())
       }
    }
}