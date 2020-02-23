fun main(args:Array<String>){
    // 키와 값을 저장함
    // 객체의 키를 활용하여 접근함
                                //key // value
    var mapSample = mutableMapOf("레벨" to "음파음파",
                                "트와이스" to "FANCY",
                                "ITZY" to "ICY")


    for(i in mapSample){
        println("${i.key}: ${i.value}")
    }

    mapSample.put("오마이걸","번지")
    println(mapSample)

    mapSample.remove("ITZY")
    println(mapSample)
}