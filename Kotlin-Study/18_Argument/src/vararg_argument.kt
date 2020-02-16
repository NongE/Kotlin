fun main(args:Array<String>){

    sum(1,2,3,4,5)
}
// vararg는 페러미터의 갯수를 지정하지 않고 많이 받을때 활요됨.
// vararg외에 다른 페러미터를 받을때에는 꼭 마지막에 위치시켜서 받아야함

fun sum(vararg num:Int){

    var total:Int = 0

    for(n in num){
        total+=n
    }

    println(total)

}