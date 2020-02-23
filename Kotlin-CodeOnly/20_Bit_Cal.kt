fun main (args:Array<String>){

    var bitData:Int = 0b10000
    //println(bitData)
    bitData = bitData or(1 shl 2)
    //0b1 -> 왼쪽으로 두번 0b100
    //0b10000
    //0b00100 or
    //0b10100
    println(bitData.toString(2))
    //0b10100

    var result = bitData and(1 shl 4)
    //0b1 -> 왼쪽으로 4번 0b10000
    //0b10000
    //0b10100 and
    //ob10000
    println(result.toString(2))
    println(result shr 4)

    bitData = bitData and((1 shl 4).inv())
    //0b1 -> 왼쪽으로 4번 0b10000
    //반전시 0b01111
    //0b01111
    //0b10100 and
    //0b00100
    println(bitData.toString(2))

    println((bitData xor(0b10100)).toString(2))
    // 0b00100
    // 0b10100 // 같으면 0 다르면 1
    // 0b10000

}