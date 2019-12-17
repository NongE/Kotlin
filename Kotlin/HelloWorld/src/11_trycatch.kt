import java.io.BufferedReader
import java.io.FileReader

fun main(args: Array<String>) {

    try {
        13 / 0
    } catch (e: Exception) {
        println(e)
    } finally {
        println("마지막 수행")
    }

    println("============")

    var num: Int? = 300
    //var sum: Int = num!!+10

  //  if(num==null){
  //      println("NULL!")
  //  }
  //  else{
  //      println(num+10)
  //  }


    println(num!!.toLong())
}

