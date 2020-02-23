fun main(args:Array<String>){
// 생성자 인스턴스 속성 초기화, 필요 구문을 실행해줌
    var a  = PersonInit("홍길동", 1995)
    var b  = PersonInit("갑을병정", 1990)
    var c  = PersonInit("김이박최", 2000)

    var d = PersonInit("백두산")


}

class PersonInit(var name:String, var birthYear:Int){

    init{
        println("${birthYear}년생 ${name}의 인스턴스가 생성되었습니다.")
    }

    constructor(name:String): this(name,1997){
        println("보조 생성자를 활용하여 ${birthYear}년생 ${name}의 인스턴스가 생성되었습니다.")
    }

}