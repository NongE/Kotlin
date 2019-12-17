

fun main(arg: Array<String>) {
    println()
    println("제어문과 관련된 예제입니다")
    println()

    println("if 관련 함수입니다")
    ifExample8()
    println()

    println("loop 관련 함수입니다")
    loopExample()
    println()

    println("when 관련 함수입니다")
    whenExample()
    println()
}

fun ifExample8() {

    var a: Any
    //a = "aaa"
    a = 3

    if (a is String) {
        println("a is String")
    } else if (a == 3) {
        println("a is 3")
    }

}

fun loopExample() {
    for (i in (0..10) step 2) {
        println("i is " + i)
    }

    var i: Int = 0
    while (i < 10) {
        println("while이 돌고 있는 i의 값은 $i")
        i++
    }
}

fun whenExample() {
    var a: Any
    a = 10

    when (a) {
        is String -> {
            println("a is String")
        }
        in (0..9) -> {
            println("0-10사이의 숫자")
        }
        else -> {
            println("???")
        }
    }
}