fun main(args:Array<String>){
    var intArr = arrayOf(1,2,3,4,5)
    var nullArr = arrayOfNulls<Int>(5)

    println(intArr[0])
    intArr[0] = 5
    println(intArr[0])
}