import java.lang.Exception
import java.lang.NullPointerException
import java.lang.NumberFormatException

fun main(args: Array<String>) {
    var v1=1.0
    var v2=2.5
    var result:Double=addValues(v1,v2)
    var res:Double=addValues(value2= v2,value1 = v1)
    println(result)
    println(res)

    var opResult=calcValues(v1,v2,"-")
    println(opResult)

    var sum=addValues(0,1,2,3,4,5)
    println(sum)

    print("Enter message : ")
    var message= readLine()
    if(message.equals("Y",true))
        println("Yes")
    else
        println("False")

    //Nulls

    var nullableString:String? = null
    val len:Int? =nullableString?.length
    println("Length is $len")

    if(len ==null){
        println("Length is $len")
    }

    val l:Int = len ?: -1
    println(l)

    try{
        val l1 = len!!
        println("l1 is $l1")
    }
    catch(e:NullPointerException){
        println("l is null")
    }

    //Iterations
    val colors:Array<String> = arrayOf("red","blue","yellow")
    val values:IntArray = intArrayOf(1,2,3,4,5)

    for (color in colors){
        println(color)
    }
    for (value in values){
        println(value)
    }
    for(i in values.indices step 2){
        println(values[i])
    }
    for(i in 0..colors.size-1){
        println(colors[i])
    }

    var counter=0
    while(counter<colors.size){
        println("Counter is $counter")
        counter++
    }

    try{
        print("Value1 : ")
        val value1:String? = readLine()
        val d1=value1!!.toDouble()

        print("Value2 : ")
        val value2:String? = readLine()
        val d2=value2!!.toDouble()

        val sum=d1+d2
        println(sum)
    }
    catch (e:KotlinNullPointerException){
        println("Value is null")
    }
    catch(e:NumberFormatException){
        println("${e.message} is not a number")
    }

}

fun addValues(value1 : Double,value2: Double):Double{
    return value1+value2
}

fun calcValues(v1:Double,v2:Double,op:String = "+"):Double{
    var result=when(op){
        "-" -> v1-v2
        "*" -> v1*v2
        "/" -> v1/v2
        "+" -> v1+v2
        else ->
            v1+v2
    }
    return result
}

fun addValues(vararg numbers:Int):Int{
    var sum=0
    for(i in numbers){
        sum+=i
    }
    return  sum
}