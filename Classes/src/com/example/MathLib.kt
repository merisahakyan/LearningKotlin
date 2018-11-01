package com.example

import java.lang.Exception
import java.lang.NullPointerException

class MathLib {

    var runningTotal=0.0
    fun addValue(value:Double){
        runningTotal+=value
    }
    companion object {
        const val OPERATIONS ="+ - * /"

        fun addValues(value1 : Double,value2: Double):Double = value1+value2
        fun subtractaddValues(value1 : Double,value2: Double):Double = value1-value2
        fun multiplyValues(value1 : Double,value2: Double):Double = value1*value2
        fun divideValues(value1 : Double,value2: Double):Double = value1/value2

        fun getInput(promt:String):Double{
            print(promt)
            val v1= readLine()
            return v1!!.toDouble()
        }
    }
}