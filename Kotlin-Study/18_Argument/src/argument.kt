fun main(args:Array<String>){

    read(7)
    read("감사합니다")
}// overload 된 모습


fun read(x:Int){
    println(x)
}

fun read(x:String){
    println("안녕하세요 ${x}")
}