interface ClickListener {
    fun onClick(event:ClickEvent)
}

class ClickEvent(val x:Int,val y:Int)

class StatefulClass(listener:ClickListener){
    private val _listener:ClickListener? =listener

    fun clickMe(x:Int,y:Int){
        _listener?.onClick(ClickEvent(x,y))
    }
}