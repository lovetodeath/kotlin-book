// String 배열
val friends = arrayOf("Tintin", "Snowy", "Haddock", "Calculus")
// 배열의 타입은 Kotlin.Array(Array<T>)
println(friends::class)
// JVM에서 실행될 때 적용되는 진짜 타입은 Java의 String 배열
println(friends.javaClass)
// 값을 가져오기 위해 인덱스 연산자 [] 사용
// 인덱스 연산자는 결국 Array<T>.get(), set()을 호출
println("${friends[0]} and ${friends[1]}")
println("")

// 정수 배열 - Integer 타입
val numbers = arrayOf(1, 2, 3)
println(numbers::class)
// Integer 클래스 배열이 생성되는데, 프리미티브 타입인 int에 비해 오버헤드가 크게 발생
println(numbers.javaClass)
println("")

// 정수 배열 - int 타입
val numbers2 = intArrayOf(1, 2, 3)
println(numbers2::class)
// Integer 클래스 배열이 생성되는데, 프리미티브 타입인 int에 비해 오버헤드가 크게 발생
println(numbers2.javaClass)
println(numbers2.size)
println(numbers2.average())
println("")

// 계산해서 배열 생성
println(Array(5) { i -> (i+1) * (i+1)}.sum())