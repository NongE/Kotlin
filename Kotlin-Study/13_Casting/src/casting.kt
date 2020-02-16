fun main (args:Array<String>){

    var a:Drink = Coke()
    a.drink()
    //a.washDish()
    if(a is Coke){
        a.washDish()
    }

    var b = a as Coke
    b.washDish()
    a.washDish()

}

open class Drink(){
    var name = "음료"

    open fun drink(){
        println("${name}을 마십니다.")
    }
}

class Coke():Drink(){

    var type = "콜라"

    override fun drink(){
        println("${name} 중에서 ${type}을 마십니다.")
    }

    fun washDish(){
        println("다 마신 ${type}의 컵을 설거지합니다")
    }

}