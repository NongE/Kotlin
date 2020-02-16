fun main(args: Array<String>) {



    /*
    var a: String? = null
    println(a?.toUpperCase()) // null 이라면 참조 뒤에 실행 안함
    println(a?:"default".toUpperCase()) // null이면 대체 한 후 실행
    println(a!!.toUpperCase()) // null exception 발생시키기
    */

    var a: String? = "Kotlin.kt"

    a?.run{
        println(toUpperCase())
        println(toLowerCase())
    }



}