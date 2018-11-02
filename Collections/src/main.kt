fun main(args: Array<String>) {
    val array1=arrayOf("red","blue","yellow")
    for (element in array1)
        println(element)

    val mixed=arrayOf("string",12)
    for (element in mixed)
        println(element)

    val nulls= arrayOfNulls<String>(2)
    nulls[0]="first"
    nulls.set(1,"second")
    for (element in nulls)
        println(element)

    val intArray= intArrayOf(3,4,5)
    for (i in intArray)
        println(i)

    array1.sort()
    for (element in array1)
        println(element)

    //Collections
    val colorList= listOf<String>("red","blue","yellow")
    println(colorList)
    println("Number of colors ${colorList.size}")

    val colors= mutableListOf<String>("red","blue","yellow")
    colors.add("green")
    colors.add("brown")
    println(colors)

    colors.remove("blue")
    colors.removeAt(0)
    println(colors)

    var colorSet :MutableSet<String> = mutableSetOf("red","blue","yellow")
    println(colorSet)

    colorSet.add("purple")
    colorSet.remove("blue")
    println(colorSet)

    var colorList=colorSet.toMutableList()
    colorList.removeAt(0)
    colorList.add("purple")
    println(colorList)

    var newColorSet=colorList.toSet()
    println(newColorSet)

    var clothingSet= mutableSetOf<ClothingItem>()
    clothingSet.add(ClothingItem("shirt","L",15.99))
    clothingSet.add(ClothingItem("shirt","XL",15.99))
    println(clothingSet)

    val colorMap= mapOf<String,Int>(
            Pair("Red",1),
            Pair("Blue",2),
            Pair("Yellow",3)
    )
    println(colorMap)

    val stateMap= mutableMapOf<String,Int>()
    stateMap.put("US",1)
    stateMap.put("UK",2)
    stateMap.put("CH",3)
    println(stateMap)

    for (state in stateMap.keys){
        println(state)
    }
    for ((state,value) in stateMap){
        println("Value of $state is $value")
    }

    val card = mutableMapOf<ClothingItem,Int>()
    card.put(ClothingItem("Shirt","M",15.99),5)
    card.put(ClothingItem("Pants","L",15.99),8)
    card.put(ClothingItem("Hat","S",15.99),1)
    var total=0.0
    for ((item,qt) in card){
        total+=(item.price*qt)
        println("Item ${item.type} @ $${item.price} = ${item.price*qt}")
    }
    println("********")
    println("Total : $total")

}