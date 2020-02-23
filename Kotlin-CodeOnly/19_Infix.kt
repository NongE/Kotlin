fun main(args:Array<String>){

    println(3.multiply(5))
    println(6 multiply 5)

}
// 연산차 처럼 쓸 수 있는 함수
infix fun Int.multiply(x:Int):Int = this*x
// 여기서 this는 앞쪽, 뒤에 페라미터가 뒤에 오는 것