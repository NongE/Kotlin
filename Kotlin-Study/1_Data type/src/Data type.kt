fun main(args: Array<String>) {

    var nullData:Int? = null
    var intNum:Int = 3


    var longNum:Long = 3L
    var hexNum:Int = 0x1af
    var byteNum:Int = 0b01010

    var doubleNum:Double = 123.5
    var floatNum:Float = 123.5f

    var boolValue:Boolean = true

    var stringValue =
        """
        안녕하세요
        저는
        코틀린을 이제
        배우고있어요
        """

    println("null 값이 들어가있는 "+nullData)
    println("초기 intNum의 값은 "+intNum)
    println("intNum 값을 변경합니다")
    intNum = 5
    println("변경된 intNum의 값은 "+intNum)
    println("Long값을 가지는 longNum은 "+longNum)

    println()

    println("헥사 가지는 hexNum은 "+hexNum)
    println("바이트 가지는 byteNum은 "+byteNum)

    println()

    println("더블 가지는 doubleNum은 "+doubleNum)
    println("플롯 값을 가지는 floatNum은 "+ floatNum)

    println()

    println("불린 가지는 booleanValue은 "+boolValue)

    println()

    println(stringValue)
    stringValue = """그런데 이렇게 쓰면
데이터가 바뀌나요?""".trimMargin()
    println(stringValue)

}