class SubClass(anInt: Int) :SuperClass(anInt){
//    override fun toString(): String {
//        return "SubClass{anInt : $_anInt}"
//    }

    override fun multiply(factor: Int): Int {
        return super.multiply(factor)*factor
    }
}