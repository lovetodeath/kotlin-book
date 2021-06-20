val names = listOf("Tom", "Jerry", "Spike")
// 인덱스 제공 indices 속성
for (index in names.indices) {
    println("Position of ${names.get(index)} is $index")
}