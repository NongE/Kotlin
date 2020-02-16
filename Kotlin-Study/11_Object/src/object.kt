fun main (args:Array<String>){

    println(Counter.count)
    Counter.countUp()
    Counter.countUp()
    println(Counter.count)
    Counter.countClear()
    println(Counter.count)


}

object Counter {

    var count:Int = 0

    fun countUp(){
        count++
    }

    fun countClear(){
        count = 0
    }

}