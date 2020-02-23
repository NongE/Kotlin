fun main(args:Array<String>){
    var a = 3
    doWhen(a)
}

fun doWhen(a:Any){
    /*
    when(a){
        1 -> println("정수 1의 값입니다.")
        "Hello" -> println("It's Helle String")
        is Long -> println("Long Type data")
        !is String -> println("It's not String data")
        else -> println("어떠한 조건도 만족하지 않습니다.")
    }*/

    var result = when(a){
        1 -> "정수 1의 값입니다."
        "Hello" -> "It's Helle String"
        is Long -> "Long Type data"
        !is String -> "It's not String data"
        else -> "어떠한 조건도 만족하지 않습니다."
    }

    println(result)
}