class Animal {
    // is연산자를 활용 other이 Animal 클래스인지 확인하여 true/false 리턴
    override operator fun equals(other: Any?) = other is Animal
}

val greet: Any = "hello"
val odie: Any = Animal()
val toto: Any = Animal()
println(odie == greet) //false
println(odie == toto) // true