fun main (args:Array<String>){

    // 문자열이 비어있는지 확인하기

    var nullString: String? = null
    var emptyString = ""
    var blankString = " "
    var normalString = "A"

    println(nullString.isNullOrEmpty())
    println(emptyString.isNullOrEmpty())
    println(blankString.isNullOrEmpty())
    println(normalString.isNullOrEmpty())
    // 정말 빈 문자열 탐색
    println()

    println(nullString.isNullOrBlank())
    println(emptyString.isNullOrBlank())
    println(blankString.isNullOrBlank())
    println(normalString.isNullOrBlank())
    // 공백도 비었다고 생각

}