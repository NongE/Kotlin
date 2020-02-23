fun main(args:Array<String>){

    var a = LateInitClass()

    println(a.printText())
    a.text = "변경되었습니다."
    println(a.printText())


}


class LateInitClass {

    lateinit var text: String

    fun printText():String{
        if(::text.isInitialized){
            return text
        }
        else{
            return "기본값"
        }
    }


}