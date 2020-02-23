fun main (args:Array<String>){

    val calculate: (Int,Int) -> Int={
        a,b->
        println(a)
        println(b)
        a+b
    }
    // 람다는 여러줄을 쓸 수 있으며 마지막 값을 반환

    val a = calculate(3,5)
    println(a)


    val b:()->Unit={
        println("패러미터가 없는 경우")
    }
    // 패터미터가 없는 경우 실행할 구문만 나열
    b()

    val c:(String)->Unit={println("${it} 람다함수")}
    c("하나 밖에 없는 ")
    // 패러미터가 하나밖에 없는 경우 it으로 사용 가능
}