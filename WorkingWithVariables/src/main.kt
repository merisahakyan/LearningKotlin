import Constants.Companion.RED
import java.lang.StringBuilder

val myName="Meri" //Top level variable visible in all functions.


fun main(args: Array<String>) {
    val num1=45  //immutable variable declaration . Can't be changed
    println("Initial value of num1 is $num1")

    var num2=40
    println("Initial value of num2 is $num2")
    num2++
    println("Changed value of num2 is $num2")

    var num3:Int =0 //Defining type directly

    val num4:Double=5.toDouble()    //Can't assign int value to double. Need to cast
    println("The value of num4 is $num4")

    println("Top level variable $myName")

    var num5:String?=null
    println("Nullable values: num5 = $num5")

    //Converts

    var myInt=42
    var myLong:Long=myInt.toLong()

    println("The type of myLong is ${myLong::class.simpleName}")

    var f=49.2
    var fToInt=f.toInt()
    println("The value of fToInt is $fToInt")

    var result= (myInt==fToInt)==myInt.equals(fToInt)  // == is much more efficient than equals
    println("== oertor and equals method are the same. result is $result")

    println("Comparision result is ${myInt.compareTo(fToInt)}")

    //Math operations
    var sum=num1.plus(num2) //same bytecode with +
    println("The sum of $num1 and $num2 is $sum")
    var dif=num1.minus(num2)
    println("The dif of $num1 and $num2 is $dif")
    var newValue=dif.inc()  //inc doesn't affect on variable
    println("Dif is incremented $newValue")

    val neg=-152.8
    val abs=Math.abs(neg)
    println("Absolute value is $abs")
    println("Rounded ${Math.round(abs)}")

    //Strings
    var aStr="Hello"
    var emptyString= String()
    var charArray=aStr.toCharArray()
    println(charArray.toList())

    aStr+="!"
    println(aStr)
    val len=aStr.length

    for (i in 0 until len){
        val c=aStr.get(i)
        println(c)
    }

    val builder=StringBuilder("Hello").append(" World").append("!")
    var resultString=builder.toString()
    println(resultString)


    //Constants
    println(RED)
}