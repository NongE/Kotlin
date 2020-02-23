fun main(args: Array<String>) {


    deliveryItem2("짬뽕")
    deliveryItem2("짬봉", space = "앞집")
    deliveryItem2("짜장면", 2)

}


fun deliveryItem2(food: String, count: Int = 1, space: String = "집") {
    // 패러미터 중 가운데를 빼먹으면 제대로 입력되지 않음
    // 그래서 패러미터를 넘길때 이름을 지정해서 넘겨주면 가능함
    println("${food} ${count}개를 ${space}으로 배송하였습니다.")


}