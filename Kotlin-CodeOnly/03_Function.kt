fun main(args:Array<String>){
    var intArr = arrayOf(1,2,3)

    var x = 1;
    var y = 2;
    var z = 3;

    println(addFun(intArr[0],intArr[1],intArr[2]))
    println(addFun(x,y,z))
}

fun addFun(a:Int, b:Int, c:Int):Int = a+b+c


/*
fun addFun(a:Int,b:int,c:Int):Int {
    return a+b+c;
}

*/