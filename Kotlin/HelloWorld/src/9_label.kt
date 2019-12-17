fun main(args: Array<String>) {

    doubleLoop()
    println("================")
    exitDoubleLoop()
    println("================")
    println(lambda())
}

fun doubleLoop() {

    for (i in (0..2)) {
        for (j in (0..5)) {
            if (j == 2) break
            println("i is $i   j is $j")
        }
        println("loop j break!")

    }
}

fun exitDoubleLoop() {

    exitHere@ for (i in (0..2)) {
        for (j in (0..5)) {
            if (j == 2) break@exitHere
            println("i is $i   j is $j")
        }
        println("loop j break!")

    }
}

var lambda = {


    exit@ for (i in (0..4)) {
        if (i == 3) break@exit;
        println(i)
    }

}