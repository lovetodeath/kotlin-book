fun greetMany(msg: String, vararg names: String) {
    println("$msg ${names.joinToString(", ")}")
}
greetMany("Hello", "Tom", "Jerry", "Spike")

fun greetMany2(vararg names: String, msg: String) {
    println("$msg ${names.joinToString(", ")}")
}
// vararg가 앞에 있을 경우 모든 파라미터가 vararg로 인식되기에 명시적 인자 사용필요
// 그래서 vararg를 꼭 뒤에 넣을 필요는 없지만 강력하게 추천
greetMany2("Tom", "Jerry", "Spike", msg = "Hello")