fun main(args: Array<String>) {

    var price = 5000
    var name = "코오틀린"
    var kotlin = Book("코틀린", 10000).apply {
        name = "[할인 특가] " + name
        discount()
    } // 인스턴스 생성 중 초기화에 사용

    kotlin.run {
        println("${name}의 가격은 ${price}입니다.")
    } // 인스턴스 생성 후 함수나 속성을 스코프에서 활용할때

     /*
    kotlin.let {
        println("${it.name}의 가격은 ${it.price}입니다.")
    }

    var kotlin = Book("코틀린",10000).also{
        it.name = "[할인 특가] " + it.name
        it.discount()
    }
    // 인스턴스를 활용할때 it을 활용해서 사용함
    // 스코프 바깥에 변수명이 충돌일 때 이를 방지 하기 위해 활용

   */


    /*
    with(kotlin){
        name = "[추가 할인] "+ name
        print()
    } // run과 동일하나 패러미터로 받는다는 차이점
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