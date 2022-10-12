package com.example.kotmvvmproject.api

import com.example.kotmvvmproject.model.UserDetails
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Field
import retrofit2.http.GET

interface ApiInterface {

    @GET("/getusers")
    suspend fun getusersdata(@Field("userid") userid:String): Response<UserDetails>
}