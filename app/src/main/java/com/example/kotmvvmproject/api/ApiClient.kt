package com.example.kotmvvmproject.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    val retrofit : Retrofit?=null

    private const val BASEE_URL="https://zinggr.co.in/"

    fun getretrofitclient():Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASEE_URL).
            addConverterFactory(GsonConverterFactory.create()).
            build()
    }

}