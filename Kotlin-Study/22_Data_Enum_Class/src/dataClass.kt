fun main(args: Array<String>) {


    val list = listOf(
        Data("Kim", 25),
        Data("Park", 23),
        Data("Hong", 26)
    )

    for((a,b) in list){
        println("${a}, ${b}")
    }
/*
    val a = General("Hong", 25)

    println(a == General("Hong", 25))
    println(a.hashCode())
    println(a)


    println("Data Class 활용")

    val b = Data("Kim", 26)
    println(b == Data("Kim", 26))
    println(b.hashCode())
    println(b)


    println(b.copy())
    println(b.copy("Park"))
    println(b.copy(id = 28))
*/

}


class General(val name: String, val id: Int) {

}

data class Data(val name: String, val id: Int) {

}