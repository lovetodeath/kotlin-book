// 중복된 값을 제거하고 생성됨
val fruits: Set<String> = setOf("Apple", "Banana", "Apple")
println(fruits)
// Set<T> 인터페이스로 되어 있고, 코틀린 및 JDK에서는 LinkedHashSet 으로 취급됨
println(fruits::class)
println(fruits.javaClass)