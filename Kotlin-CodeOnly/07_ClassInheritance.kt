fun main(args:Array<String>){

    // 상속은 기존 클래스를 확장해서 속성이나 함수를 추가할때
    // 클래스들의 공통점을 뽑아 관리할때

    var a = Dog("아리",3)
    var b = Cat("디디",4)
    var c = Animal("아리",3,"개")
    a.introduce()
    a.sound()
    b.introduce()
    b.sound()
    c.introduce()
}

open class Animal (var name:String, var age:Int, var type:String){

    init{
        println("${age}살 ${name}에 대한 Animal 기본 생성자가 생성됩니다.")
    }
    fun introduce(){
        println("${name}는 ${age}살인 ${type}입니다.")
    }
}

class Dog(name:String, age:Int): Animal(name,age,"걔"){
    fun sound(){
        println("멍멍")
    }

}

class Cat(name:String, age:Int):Animal(name,age,"고양이"){
    fun sound(){
        println("야옹")
    }
}

