interface IDog {
    val fur:String
    fun speak() {
        println("I'm dog")
    }
}

interface ICat {
    val fur:String
    fun speak(){
        println("I'm cat")
    }
}

class Retriever : IDog,ICat{
    override val fur: String
        get() = "golden"

    override fun speak() {
        super<IDog>.speak()
    }
}