package com.example.kotmvvmproject.viewmodel

import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotmvvmproject.model.UserDetails
import com.example.kotmvvmproject.repository.UserdataRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.contracts.contract

class Userdetailsviewmodel(private val repository:UserdataRepository): ViewModel(){

    init {
        vieModelScope.launch(Dispatchers.IO) {
            repository.getUserdata()
        }

    }

    val userdata:LiveData<UserDetails>
    get() = repository.livedataobj

  /*  val userDetails=UserDetails("Adhilakshmisueresh","nidumoluadhilakshmi@gmail.com");



    val usermutabledata:MutableList<Int> = mutableListOf(1,2,3)


    val initialuserdetails=MutableLiveData("Adhilakshmi")

    fun changeusername() {
        Log.e("button click","button is clciked");
        initialuserdetails.value="Ragipindi Adhilakshmi"
*/
    /* val duplicatedetails=   with(userDetails){
         username="indizeal Adhilakshmi"
         useremail="adhilakshmi@indizeal.in"
         initialuserdetails.value=username
            Log.e("user name is",username)
            Log.e("useremail is",useremail)
        }*/

       /* userDetails.apply {
            username="apply scope is used"
            useremail="appyused@gmail.com"
            initialuserdetails.value=username
        }*/

     /*val alsoduplicatedata=   usermutabledata.also {
            it.removeAt(2)
            it.add(2,10)
            println("number is: $it")

          //  print("number is",$it)

        }
        println("also duplicate data:$alsoduplicatedata")*/

      /*  var name:String?="adhilaksjhmi"
        name?.let {
            println("string lenght is ${it.reversed()}")
        }

    }
*/










}