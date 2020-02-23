fun main(args: Array<String>) {

    var a = FoodPool("짜장")
    var b = FoodPool("짬뽕")

    a.countUP()
    a.countUP()
    b.countUP()
    b.countUP()
    b.countUP()

    println(a.foodCount)
    println(b.foodCount)
    println(FoodPool.totalCount)
}


class FoodPool(var name: String) {

    companion object total {
        var totalCount = 0
    }

    var foodCount = 0

    fun countUP() {
        foodCount++
        totalCount++
    }

}