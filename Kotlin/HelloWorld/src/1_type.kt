fun main(arg: Array<String>) {
    varTest()
    valTest()
}

fun varTest() {
    var num: Int
    num = 1

    var num2 = 5

    num = 3
    println("var Test!")
    println(num)
    println(num2)

}

fun valTest() {

    val txt: String = "val Test!"
    //txt = "Change This!"
    println(txt)
}
