import kotlinx.coroutines.*

fun main (args:Array<String>){

    runBlocking {
        var result = withTimeoutOrNull(50){

            for(i in 1..10){
                println(i)
                //delay(10)
            }

            "Finish"
        }

        println(result)

    }
}