fun main (args:Array<String>){

    var a = dragon()

    a.eat()
    a.run()
}

interface Running{
    fun run()
}

interface Eatting{
    fun eat(){
        println("냠냠 밥을 먹습니다")
    }

}

class dragon():Running,Eatting{
    override fun run(){
        println("날아다닙니다.")
    }

    override fun eat() {
        println("우걱우걱 먹습니다.")
    }
}