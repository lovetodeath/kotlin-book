// 기존 numbers: IntArray 대신 이름 앞에 vararg 추가하고 타입은 단일 Int로 변경
fun max(vararg numbers: Int): Int {
    var large = Int.MIN_VALUE
    for (number in numbers) {
        large = if (number > large) number else large
    }
    return large
}

println(max(1, 5, 2))
println(max(1, 5, 2, 12, 7, 3))

val values = intArrayOf(1, 21, 3)
// 배열을 인자로 넘기면 ERROR 발생 // error: type mismatch: inferred type is IntArray but Int was expected
//println(max(values))
// 단순 반복
println(max(values[0], values[1], values[2]))
// 스프레드 연산자 (*) 사용
println(max(*values))
// 리스트에는 직접적으로 스프레드 연산자 사용 불가하고 배열로 변환해서는 사용 가능
println(max(*listOf(1, 4, 18, 12).toIntArray()))