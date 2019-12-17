fun main (args:Array<String>){

    ifExample()

}

fun ifExample(){

    var a : Any? = null

    if(a == "aaa"){
        println("문자 감지! :" + a)
    }
    else if(a is Float){
        println("Float 형이 감지되었습니다! : "+a)
    }
    else if(a in(0..9)){
        println("감지된 숫자는 0~9 사이의 수입니다")
    }
    else if(a == null){
        println("NULL!")
    }

}