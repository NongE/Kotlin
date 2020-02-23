fun main (args:Array<String>){

    var t1 = "Test.Kotlin.String"

    println(t1.length)
    println(t1.toLowerCase()) // 소문자로 변환
    println(t1.toUpperCase()) // 대문자로 변환

    var t2 = t1.split(".") // 특정 문자를 기준으로 나눠줌
    println(t2)

    println(t2.joinToString()) // 문자열합치기, ()안에 넣는 기준으로 합쳐줌
    println(t2.joinToString("~"))

    println(t1.substring(5..10))
    // 특정 위치 문자 출력

    println()
    ////////
    // 문자열이 비어있는지 확인하기

    var nullString: String? = null
    var emptyString = ""
    var blankString = " "
    var normalString = "A"

    println(nullString.isNullOrEmpty())
    println(emptyString.isNullOrEmpty())
    println(blankString.isNullOrEmpty())
    println(normalString.isNullOrEmpty())

    println()

    println(nullString.isNullOrBlank())
    println(emptyString.isNullOrBlank())
    println(blankString.isNullOrBlank())
    println(normalString.isNullOrBlank())

}