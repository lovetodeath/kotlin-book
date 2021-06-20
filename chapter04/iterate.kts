// 배열 생성 kotlin.arrayOf(). kotlin을 적거나, import 하지 않아도 됨
// intArrayOf()를 사용해도 되지만 arrayOf를 사용하고 타입추론으로 Int 배열 생성
val array = arrayOf(1, 2, 3)
for (e in array) { print("$e, ") }
println("")

val list = listOf(1, 2, 3)
println(list.javaClass) // class java.util.Arrays$ArrayList
for (e in list) { print("$e, ") }
println("")