fun main(args:Array<String>){

    var a = Person("홍길동",1995)
    var b = Person("갑을병정",1990)
    var c = Person("김이박",1988)


    a.introduce()
    b.introduce()
    c.introduce()
}


class Person(var name:String, var birthYear:Int){

    fun introduce(){
        println("안녕하세요 ${birthYear}년생 ${name}입니다!")
    }
}