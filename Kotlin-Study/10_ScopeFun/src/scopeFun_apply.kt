fun main(args: Array<String>) {

    var price = 5000
    var name = "코오틀린"
    var kotlin = Book("코틀린", 10000).apply {
        name = "[할인 특가] " + name
        discount()
    }
/*
    var kotlin = Book("코틀린",10000).also{
        it.name = "[할인 특가] " + it.name
        it.discount()
    }
 */
    kotlin.run {
        println("${name}의 가격은 ${price}입니다.")
    }
    kotlin.let {
        println("${it.name}의 가격은 ${it.price}입니다.")
    }

    /*
    kotlin.run{
        println("추가 할인을 진행합니다!")
        price -= 1000
    }
    with(kotlin){
        name = "[추가 할인] "+ name
        print()
    }
    */


}

class Book(var name: String, var price: Int) {

    fun discount() {
        price -= 1000
    }

    fun print() {
        println("${name}의 가격은 ${price}입니다.")
    }
}