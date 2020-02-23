import kotlinx.coroutines.*

fun main(args: Array<String>) {



    runBlocking {

        // 반환 값이 없음
        var a = launch {

            for (i in 1..5) {
                println(i)
                delay(10)
            }
        }

        // 반환값이 존재
        var b = async {

            "async 종료"
        }

        println("async 대기")
        println(b.await())


        println("launch 대기")
        a.cancel()
        //a.join() // 끝날때까지 대기
        println("launch 종료")

    }
}


