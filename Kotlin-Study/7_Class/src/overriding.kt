fun main(args:Array<String>){

    var a = tiger()
    a.eat()

    var b = rabbit()
    b.eat()
    b.sniff()
}

open class Animal2(){
    open fun eat(){
        println("밥을 먹습니다")
    }
}

class tiger():Animal2(){

    override fun eat(){
        println("고기를 먹습니다.")
    }

}

abstract class Animal3(){
    abstract fun eat()
    fun sniff(){
        println("킁킁")
    }
}

class rabbit():Animal3(){
    override  fun eat(){
        println("풀을 뜯어먹습니다")
    }
}