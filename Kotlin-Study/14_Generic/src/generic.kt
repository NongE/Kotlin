fun main (args:Array<String>){


    genericEx(A()).doShout()
    genericEx(B()).doShout()
    genericEx(C()).doShout()

    doShouting(B())

}

fun <T:A>doShouting(t:T){
    t.shout()
}

open class A(){

    open fun shout(){
        println("A가 소리칩니다.")
    }
}

class B():A(){
    override fun shout(){
        println("B가 소리칩니다.")

    }
}

class C():A(){
    override fun shout(){
        println("C가 소리칩니다.")

    }
}

class genericEx<T:A>(var t: T){
    fun doShout(){
        t.shout()
    }
}