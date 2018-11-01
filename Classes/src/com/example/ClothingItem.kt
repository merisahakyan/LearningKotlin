package com.example

data class ClothingItem constructor(private var _type:String?,
                                    val size:String,
                                    private var _price:Double) {
    init { //init is calling when primary constructor is called
        //_type=_type?.toUpperCase() ?: "UNKNOWN"
    }
    constructor(size:String, price: Double) : this(null,size,price){
        _type="Unknown"
    }

    var type:String? =_type
        get() = field ?: "Unknown"

    var price:Double=_price
        set(value) {
            field = value * .9
        }
        get() = field
}