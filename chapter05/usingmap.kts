// to() 확장함수를 통해 key-value pair 생성, mapOf()는 Pair<K, V>를 인자로 취급
// to() 확장함수는 코틀린의 모든 객체에서 사용 가능
val sites = mapOf("pragprog" to "https://www.pragprog.com", "agiledeveloper" to "https://agiledeveloper.com")
println(sites.size)

println("")
println("contains 활용")
println(sites.containsKey("agiledeveloper"))
println(sites.containsValue("https://example.com"))
println(sites.contains("agiledeveloper"))
println("agiledeveloper" in sites)

println("")
println("get 사용")
// key에 접근은 get() 메소드 사용하지만, 해당 key가 map에 존재하지 않으면 값이 나오지 않음
// key가 map에 없을 경우 nullabel 타입 리턴하기 때문에, 컴파일 시 오류발생시키고 nullable 참조 타입 (String?) 사용 권장
// usingmap.kts:17:28: error: type mismatch: inferred type is String? but String was expected
//val pragProgSite: String = sites.get("pragprog")
val pragProgSite: String? = sites.get("pragprog")
println(pragProgSite)

println("")
println("인덱스 연산자 사용")
val pragProgSite2: String? = sites["pragprog"]
println(pragProgSite2)

println("")
println("nullable 참조 회피, 기본값 리턴")
val agiledeveloper = sites.getOrDefault("agiledeveloper", "http://example.com")
println(agiledeveloper)

println("")
println("새로운 맵 생성")
// mapOf() 함수는 읽기전용이기에 수정불가, 그래서 필요시 새로운 맵 생성
val sitesWithExample = sites + ("example" to "https://example.com")
println(sitesWithExample)
val sitesWithoutAgileDeveloper = sites - "agiledeveloper"
println(sitesWithoutAgileDeveloper)

println("")
println("loop 사용")
for (entry in sites) {
    println("${entry.key} --- ${entry.value}")
}
for ((key, value) in sites) {
    println("$key --- $value")
}