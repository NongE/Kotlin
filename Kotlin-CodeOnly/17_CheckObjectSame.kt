fun main(args: Array<String>) {

    /*
    객체, 내용이 동일한지 확인하는 부분임
    내용의 동일은 ==, 객체의 동일은 ===을 활용하면됨

    하지만 커스텀 class를 제작할때는 equal이 구현이 안되있음
    이럴때는 상속받아서 따로 구현해야함
     */


    var a = Product("콜라",1000)
    var b = Product("콜라",1000)
    var c = a
    var d = Product("사이다",1000)

    println(a == b)
    println(a === b)

    println(a == c)
    println(a === c)

    println(a == d)
    println(a === d)

}

class Product(val name: String, var price: Int) {

    override fun equals(other: Any?): Boolean {
        if (other is Product) {
            return other.name == name && other.price == price
        }
        else{
            return false
        }
    }

}