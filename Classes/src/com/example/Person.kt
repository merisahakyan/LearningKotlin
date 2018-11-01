package com.example

data class Person (private val firstname:String,
                   private val lastname:String){
    val fullname:String
        get() = "$firstname $lastname"
}