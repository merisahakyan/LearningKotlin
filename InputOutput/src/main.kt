import java.io.FileReader
import java.io.FileWriter
import java.lang.Exception

fun main(args: Array<String>) {
    println("Enter message : ")
    val message = readLine().toString()
    val path = "message.txt"

    writeToFile(message,path)
    var readMessage=readFile(path)
    println(readMessage)

}

fun writeToFile(message:String,path:String){
    try {
        val writer = FileWriter(path,true) //second parameter for appending new text
        writer.write(message+"\n")
        writer.close()
    }catch(ex:Exception){
        println(ex.message)
    }
}

fun readFile(path:String) : String{
    val reader = FileReader(path)
    var readMessage : String = ""
    var char : Int?
    try{
        do{
            char=reader.read()
            readMessage+=char.toChar()
        }while (char != -1)
    }catch (ex:Exception){
        println(ex.message)
    }
    return readMessage
}