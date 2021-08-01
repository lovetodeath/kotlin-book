class Animal(val age: Int) {
    // 초기형
    //override operator fun equals(other: Any?):Boolean {
    // 별도의 캐스트 필요없이 바로 other.age 사용 가능
    // 앞단에 is 연산자로 타입체크를 했기에 그 뒤에서는 캐스트없이 사용 가능
    // 앞단에 is 연산자가 없었다면 컴파일 오류 발생
    //return if (other is Animal) age == other.age else false
    //}
    // 리팩토링
    // ||연산자 &&연산자 에서도 사용 가능
    override operator fun equals(other: Any?) = other is Animal && age == other.age
}

val odie = Animal(2)
val toto = Animal(2)
val butch = Animal(3)
println(odie == toto)
println(odie == butch)