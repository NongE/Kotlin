fun main (args:Array<String>){
    b(::a)
   // val c:(String)->Unit = {str->println("$str 람다함수")}
    val c ={str:String->println("$str 람다함수")}
    b(c)

   // e(::d)

    val l = {num:Int ->  num*2}
   println(e(l))


}

fun a (str: String){
    println("$str 함수 : a")
}

fun b (aFun:(String)->Unit){
    aFun("b가 호출한")
}
//////

fun d(num:Int): Int{
    println("${num*2} 입니다")
    return num*2
}

fun e(xFun:(Int)->Int): Int{
   return xFun(5)
}
