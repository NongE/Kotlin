fun main(args: Array<String>) {

    val numbers = listOf(-3, 7, 2, -10, 1)

    println(numbers.flatMap { listOf(it * 10, it + 10) })
    // 각각의 객체에 10을 곱하고 더한 값을 다시 리스트로 구성

    println(numbers.getOrElse(1) { 50 })
    println(numbers.getOrElse(10) { 50 })// 인덱스 값을 찾아 반환하는데 조건에 맞는게 없다면 중괄호 내용 반환

    val names = listOf("A","B","C","D")

    println(names zip numbers)


}