package com.example

import java.lang.Exception
import java.lang.NullPointerException
import Operation.*
import java.text.NumberFormat
import java.util.*

fun main(args: Array<String>) {
    try{
        val v1=MathLib.getInput("Input first number : ")
        val v2=MathLib.getInput("Input second number : ")
        val sum=MathLib.addValues(v1,v2)
        println(sum)
        val mathLib=MathLib()
        while(mathLib.runningTotal<=100){
            val input=MathLib.getInput("Input the value : ")
            mathLib.addValue(input)
            println("Current total : ${mathLib.runningTotal}")
        }

        val value1=MathLib.getInput("Input numeric value : ")
        val value2=MathLib.getInput("Input numeric value : ")
        print("Select an operation ${MathLib.OPERATIONS} :")
        val op= readLine()

        val result:Double? = when(op){
            ADD.operator -> MathLib.addValues(value1,value2)
            SUBTRACT.operator -> MathLib.subtractaddValues(value1,value2)
            MULTIPLY.operator -> MathLib.multiplyValues(value1,value2)
            DIVIDE.operator -> MathLib.divideValues(value1,value2)
            else -> throw Exception("Unknown error")
        }
        println(result)

        val item1=ClothingItem("Shirt","L",19.99)
        println(item1)
        val item2=ClothingItem("L",15.63)
        println(item2)
        println(item2.type)

        Locale.setDefault(Locale.FRANCE)
        val formatter=NumberFormat.getCurrencyInstance()

        item2.price=10.0
        println(formatter.format(item2.price))

        val person=Person("Meri","Sahakyan")
        println("Fullname is ${person.fullname}")
    }
    catch(e: NullPointerException){
        println("The ${e.message} is null")
    }
    catch(e: Exception){
        println(e.message)
    }

}

