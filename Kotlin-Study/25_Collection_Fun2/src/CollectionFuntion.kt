fun main(args:Array<String>){



    var personList = listOf<Person>(
        Person("김을병",1992),
        Person("김을병",1996),
        Person("박을병",1999),
        Person("최을병",2003)
    )


    var personMap = personList.associateBy { it.birth }

    personMap.forEach {
        if(it.key == 1992) println(it.value.name)
    } // 리스트를 조건을 토대로 한 키 맵을 만들어줌


    println(personList.groupBy { it.name }) // 기준을 토대로 그룹을 생성


    val(over98, under98) = personList.partition { it.birth>1998 }  // 조건에 따라 파티션을 나눠줌
    println(over98)
    println(under98)


}


data class Person(var name:String, var birth:Int){

}