// 1부터 5까지 반복, kotlin.ranges 패키지
val oneToFive: IntRange = 1..5
println(oneToFive.contains(4)) // true
println(oneToFive.contains(6)) // false

// IntRange 타입을 명시하지 않아도 타입추론
val oneToSix = 1..6
println(oneToSix.contains(5)) // true
println(oneToSix.contains(7)) // false

// a부터 e까지 범위
val aToE: CharRange = 'a'..'e'
println(aToE.contains('e')) // true
println(aToE.contains('f')) // false

// 원시타입 외에도 반복 가능
val seekHelp: ClosedRange<String> = "hell".."help"
println(seekHelp.contains("helm")) // true
println(seekHelp.contains("helq")) // false