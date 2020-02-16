fun main (args:Array<String>){

    EventPrinter().start()
    //Counter(EventPrinter()).count()

}


interface EventListener{

    fun onEvent(count:Int)
}

class Counter(var listener: EventListener){

    fun count(){
        for(i in 0..100){
            if(i % 5 == 0 ) listener.onEvent(i)
        }
    }
}
/*
class EventPrinter(): EventListener{
    override fun onEvent(count:Int){
        print("${count}-")
    }

    fun start(){
        var counter = Counter(this)
        counter.count()
    }
}*/

/*anonymous Object*/

class EventPrinter(){
    fun start(){
        var counter = Counter(object:EventListener{
            override fun onEvent(count:Int){
            print("${count}-")
        }
        })
        counter.count()
    }
}
