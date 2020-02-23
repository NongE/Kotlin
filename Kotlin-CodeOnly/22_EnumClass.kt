fun main (args:Array<String>){


    var state = State.SING
    println(state)

    state = State.SLEEP
    println(state.isSleeping())


    state = State.EAT
    println(state.message)



}


enum class State(val message:String){

    SING("노래"),
    EAT("밥"),
    SLEEP("잠");

    fun isSleeping() = this == State.SLEEP


}