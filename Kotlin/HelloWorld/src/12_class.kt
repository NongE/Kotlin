fun main (args:Array<String>){

    var obj1 = TestClass()
    println(obj1.name)
    var obj2 = TestClass("파라메터 받음")
    var obj3 = ParentClass()
    println(obj3.getMyname())
    var obj4 = ChildClass()
    println(obj4.getMyname())
}

class TestClass{
    var name: String = "Hello"

    constructor(){
        println("기본 생성자입니다")
    }

    constructor(name: String) {
        this.name = name
        println("$name 은 받은 파라메터")
        println(name)
    }
}

open class ParentClass{
    var name: String = this.toString()

    fun getMyname() = name
}

class ChildClass: ParentClass(){

}