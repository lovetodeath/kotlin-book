// Triple은 코틀린 스탠다드 라이브러리
fun getFullName() = Triple("John", "Quincy", "Adams")

val result = getFullName()
val first = result.first
val middle = result.second
val last = result.third
println("$first $middle $last")

// 우아하게 사용, 리턴타입이 Pair/Triple/다른 데이터 클래스일 경우 구조분해로 값 추출 가능
val (first2, middle2, last2) = getFullName()
println("$first2 $middle2 $last2")

// 특정 속성 스킵은 _ 를 사용
val (first3, _, last3) = getFullName()
println("$first3 $last3")
val (first4, _, _) = getFullName()
println("$first4")
// 특정 값만 할당
val (_, middle5) = getFullName()
println("$middle5")