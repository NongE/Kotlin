var gName: String = "전역변수 선언 완료"
var gName2: String = "이렇게 선언 + ${gName}"

fun main(args: Array<String>) {

    println(gName)
    if (true) {
        var lName = "지역변수 선언 완료"
        println(lName)
        println(gName)
    }
    //println(lName)
}