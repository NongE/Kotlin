fun main(args:Array<String>){

    for(i in 0..9 step 3){
        print("$i ")
    }
    println()
    for(i in 9 downTo 0 step 3){
        print("$i ")
    }

    println()
    for(i in 'a'.. 'z' step 3){
        print("$i ")
    }
}