import java.util.*

fun main(args: Array<String>) {

    var sName = "Kotlin"

    println()
    println(sName + ": 이렇게 하면 문자열이 추가로 붙는다구!?")

    var sTest = """
이건 또
    무슨 방법일까?
        파이썬에서 쓰는 방식이라던데?
    """

    println(sTest)


    var sTestLoad = "sName을 이렇게도 불러 올 수 있대요! : ${sName + "이렇게 하면? " + Date()}"

    println(sTestLoad)

}