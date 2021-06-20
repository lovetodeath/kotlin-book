// 어떤 클래스에도 속해지 않은 함수
fun nofluff() {
    println("nofluff called...")
    // 예외 생성
    throw RuntimeException("oops")
}
println("not in a function, calling nofluff()")
try {
    // 함수 아래에서 단독적으로 동작하는 코드가 함수 nofluff()를 호출
    nofluff()
} catch(ex: Exception) {
    val stackTrace = ex.getStackTrace()
    println(stackTrace[0]);
    println(stackTrace[1]);
}