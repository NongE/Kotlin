fun main(args:Array<String>){

    println("브레이크문 예제입니다.")

    for(i in 1..10){
        if (i==3) break
        println(i)
    }


    println("컨틴유를 활용")
    for(i in 1..10){
        if(i==3) continue
        println(i)
    }

    println("이중 포문중 브레이크 하는 방법")
    println("lable을 활용해서 탈출하는 방법임")
    Loop@for(i in 1..10){
        for(j in 1..10){
            if(i == 1 && j == 2) break@Loop
            println("i: $i, j: $j")
        }
    }
}