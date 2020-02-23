fun main(args:Array<String>){



    val foodcourt = FoodCourt()

    foodcourt.searchFoodPrice("크림파스타")
    foodcourt.searchFoodPrice("스테이크")
    foodcourt.searchFoodPrice("피자")


}



class FoodCourt{


    fun searchFoodPrice(foodName:String){

        val price = when(foodName){

            CONST_PASTA -> 12000
            CONST_STEAK -> 18000
            CONST_PIZZA -> 22000


            else -> 0
        }

        println("${foodName}은 ${price}원 입니다.")

    }


    companion object{
        const val CONST_PASTA = "크림파스타"
        const val CONST_STEAK = "스테이크"
        const val CONST_PIZZA = "피자"
    }


}