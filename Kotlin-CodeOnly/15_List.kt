fun main (args:Array<String>){

    var a = listOf("사과","배","오렌지")
    println(a[1])

    for(x in a){
        print("${x} ")
    }

    println()

    var b = mutableListOf(6,3,1)
    println(b[1])
    println(b)

    b.add(100)
    println(b)
    b.add(0,9)
    println(b)
    b.removeAt(3)
    println(b)
    b.shuffle()
    println(b)
    b.sort()
    println(b)
}