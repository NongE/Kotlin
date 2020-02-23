fun main(args: Array<String>){

    // 따로 순서가 없어서 인덱스로 접근이 안됨
    // contains를 활용하여 해당 내용이 있는지 확인하는 방법을 사용

    var setSample = mutableSetOf("사과","배","키위")

    for(i in setSample){
        println("${i}")
    }

    setSample.add("망고")
    println(setSample)

    setSample.remove("사과")
    println(setSample)

    println(setSample.contains("배"))

}