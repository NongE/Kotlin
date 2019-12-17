fun main(args: Array<String>) {

    // 읽기 전용 리스트 만들기
    val lst = listOf(1, 3, 5, "짜잔", 9.089, 23.0f)

    for (i in (0..lst.size - 1)) {
        println(lst[i])
    }

    println("===============")

    var lstrw = mutableListOf<String>()

    lstrw.add("Hello!")
    lstrw.add("Kotlin")
    lstrw.add("Welcome!")

    for (i in 0..lstrw.size - 1) {
        println(lstrw[i])
    }
    println("매소드를 삭제합니다")
    lstrw.removeAt(0)
    for (i in 0..lstrw.size - 1) {
        println(lstrw[i])
    }

    println("===============")

    var m = hashMapOf("고양이" to 1, "강아지" to 2)
    println(m["강아지"])

}