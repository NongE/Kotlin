fun main(args:Array<String>){


    deliveryItem("짬뽕")
    deliveryItem("짬봉",3,"앞집")
    deliveryItem("짜장면",2)

}


fun deliveryItem(food:String, count:Int=1, space:String="집"){
// 함수에서 페러미터를 넣지 않아도 기본으로 설정함
    println("${food} ${count}개를 ${space}으로 배송하였습니다.")


}