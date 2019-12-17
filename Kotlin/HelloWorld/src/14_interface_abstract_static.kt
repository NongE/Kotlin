fun main(args: Array<String>) {
    valTest()
    println()
    SimpleImp().TestFunc()
    SimpleImp().func()
    var obj: SimpleInterface

}

interface SimpleInterface {

    fun TestFunc() : String
    fun func()
}

class SimpleImp : SimpleInterface {
    override fun TestFunc() = "HEllo!"
    override fun func(){
        println("interface")
    }
}

