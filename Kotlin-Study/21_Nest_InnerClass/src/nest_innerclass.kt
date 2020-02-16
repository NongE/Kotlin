fun main(args:Array<String>){

    Outer.Nested().introduce()

    var outer = Outer()
    var inner = outer.Inner()

    inner.introduceInner()
    inner.introduceOuter()

    outer.text = "Changed Outer Class"
    inner.introduceOuter()

}


class Outer{
    var text = "Outer Class"

    class Nested{
        fun introduce(){
            println("Nested Class")
        }
    }

    inner class Inner{
        var text = "Inner Class"

        fun introduceInner(){
            println(text)
        }

        fun introduceOuter(){
            println(this@Outer.text) // 이너클래스와 외부 클래스의 변수 명이 겹칠 경우 this@이름을 쓴다
        }

    }

}