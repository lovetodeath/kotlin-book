// pair 생성 예제
println(Pair("Tom", "Jerry")) // (Tom, Jerry)
println(mapOf("Tom" to "Cat", "Jerry" to "Mouse")) // {Tom=Cat, Jerry=Mouse}

val airportCodes = listOf("LAX", "SFO", "PDX", "SEA")
// map 반복자
val temperatures = airportCodes.map { code -> code to getTemperatureAtAirport(code) }
for (temp in temperatures) {
    println("Airport: ${temp.first}: Temperature: ${temp.second}")
}

fun getTemperatureAtAirport(code: String): String = "${Math.round(Math.random() * 30) + code.count() } C"