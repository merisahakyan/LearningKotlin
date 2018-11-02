import java.util.*

fun main(args: Array<String>) {
    val sup=SuperClass(42)
    println(sup)

    val sub=SubClass(30)
    println(sub)

    println(sup.multiply(10))
    println(sub.multiply(10))

    val buster=Retriever()
    makeItSpeak(buster)
    reportBreed("Buster",buster)
    println("This dog's fur is ${buster.fur}")

    val stateful=StatefulClass(object : ClickListener{
        override fun onClick(event: ClickEvent) {
            println("coordinates : (${event.x},${event.y})")
        }
    })
    stateful.clickMe(12,25)

    //Units
    val helloWorld={
        println("Hello world")
    }
    helloWorld()

    val sayHello={
        user:String,age:Int -> println("$user is $age")
    }
    sayHello("Meri",20)

    val stateArray= arrayOf("US","California","Virginia","Vegas")
    //val sorted=stateArray.sortedBy { state->state.length }
    val sorted=stateArray.sortedBy { it.length }
            .filter { it.startsWith("v",true) }
    println(sorted)
}

fun reportBreed(name:String,dog:IDog){
    println("$name is a ${dog::class.simpleName}")
}

fun makeItSpeak(dog:IDog){
    dog.speak()
}


