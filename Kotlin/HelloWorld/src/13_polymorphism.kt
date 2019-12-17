fun main(args: Array<String>) {

    var obj1 = baseClass()
    obj1.func1()
    var obj2 = childClass()
    obj2.func1()
    obj2.func2()
    obj2.func2("문자열 파라메터")
    obj2.func2("문자열 파라메터", 100)


}

open class baseClass {

    open var name: String = "base"
    open fun func1() = println(this.toString())
    private fun onlyMyFunc() = println("클래스 내부에서만 활용")

    constructor() {
        onlyMyFunc()
    }
}

class childClass : baseClass() {

    override var name = "child"
    override fun func1() {
        println(this.toString() + " 재정의함")
    }

    fun func2() =
        println("func2")


    fun func2(s: String) =
        println("func2: $s")


    fun func2(s: String, i: Int) =
        println("func2: $s, $i")

}