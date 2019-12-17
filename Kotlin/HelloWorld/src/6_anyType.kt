fun main(args: Array<String>) {

    var anything: Any //= 1
    //anything = "hello"
    anything = 11.11
    //anything = 10.0f

    if (anything !is String) {
        if (anything is Float) {
            println("anything is Float")
        } else if (anything is Double) {
            println("anything is double")
        }
    }
    if (anything is Int) {
        println("anything is int")
    }
}