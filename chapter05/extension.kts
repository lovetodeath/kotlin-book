val names = listOf("Tom", "Jerry")
println(names.javaClass)
// withIndex() 메소드는 IndexedValue (data class)라는 특별한 itorator를 리턴
for ((index, value) in names.withIndex()) {
    println("$index $value")
}