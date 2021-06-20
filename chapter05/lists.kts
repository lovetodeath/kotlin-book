val fruits: List<String> = listOf("Apple", "Banana", "Grape")
println(fruits)
// 리스트 요소 접근 - get() 또는 인덱스연산자 [] ([]도 내부적으로는 get() 사용)
// 인덱스 연산자 사용이 get()보다 노이즈가 적고 편리하기에 추천
println("first's ${fruits[0]}, that's ${fruits.get(0)}")

println("")
println("contains() 및 in")
// 콜렉션에 값이 있는지 없는지 확인 - contains() 또는 in연산자
// in연산자가 더 표현력이 좋고, 직관성이 있음
println(fruits.contains("Apple"))
println("Apple" in fruits)
println("")

// listOf가 리턴하는 참조를 사용할 때는 변경 불가 테스트
// lists.kts:13:8: error: unresolved reference: add
// 컴파일 시간에 Java의 Arrays.asList()로 만든 JDK 객체의 뷰로 동작
// 변화를 허용하거나 리스트를 바꿀 수 있는 권한 가진 메소드가 없어서 컴파일 실패
//fruits.add("Orange")

println("추가")
// 기존 리스트 카피해서 신규 리스트 생성하면서 추가, 기존 리스트는 변경하지 않음
val fruits2 = fruits + "Orange"
println(fruits)
println(fruits2)

println("")
println("제거")
// 기존 리스트 카피해서 신규 리스트 생성하면서 제거, 기존 리스트는 변경하지 않음
val fruits3 = fruits - "Banana"
println(fruits)
println(fruits3)

println("")
println("없는거 제거")
// 제거 하려는 요소가 리스트에 없으면 동일 리스트 생성됨
val fruits4 = fruits - "Orange"
println(fruits)
println(fruits4)

println("")
println("클래스 확인")
// fruits의 클래스
// 코틀린의 뷰 인터페이스로 접근했지만 인스턴스는 JDK용
println(fruits::class)
println(fruits.javaClass)

println("")
println("mutable list - mutableListOf")
// 변경가능한 뮤터블 리스트
val fruits5: MutableList<String> = mutableListOf("Apple", "Banana", "Grape")
println(fruits5::class)
println(fruits5)
fruits5.add("Orange")
println(fruits5)

println("")
println("mutable list - arrayListOf")
// 변경가능한 뮤터블 리스트
// arrayListOf() 도 동일함
val fruits6: MutableList<String> = arrayListOf("Apple", "Banana", "Grape")
println(fruits6::class)
println(fruits6)
fruits6.add("Orange")
println(fruits6)