fun main(args: Array<String>) {

    var nameList = listOf("홍길동", "사아람", "김사람", "홍을병", "갑을병")

    nameList.forEach {
        print(it + " ")
    } // 일반적으로 포문 돌면서 출력하는 방식

    println()

    println(nameList.filter { it.startsWith("홍") }) // 홍으로 시작하는 사람 필터링

    println(nameList.map { "이름: " + it }) // 각각의 내용에 새로운 내용 추가

    println(nameList.any { it == "사아람" }) // 하나라도 조건이 맞다면 true

    println(nameList.all { it.length == 3 }) // 모두 조건에 맞는다면 true

    println(nameList.none { it.startsWith("김") }) // 하나도 조건에 맞지 않늗다면

    println(nameList.first{it.startsWith("홍")}) // 홍으로 시작하는 단어 중 첫번째 내용

    println(nameList.last { it.startsWith("홍") }) // 홍으로 시작하는 단어 중 마지막 내용

    println(nameList.count { it.contains("을") }) // 갯수 세기, 을을 포함하는 내용 갯수 세기

}