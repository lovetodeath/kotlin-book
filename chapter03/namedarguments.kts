// 아규먼트의 의미를 알려면 아래의 함수를 직접 봐야 함
createPerson("Jake", 12, 152, 43)

// 명시적 아규먼트 사용
// 파라미터 순서 무관
createPerson(name = "Jake", age = 12, weight = 43, height = 152)
// 이름이 없을 경우 위치에 기반해서 인식
createPerson("Jake", age = 12, weight = 43, height = 152)
createPerson("Jake", 12, weight = 43, height = 152)
// 기본 아규먼트 사용, 명시적 아규먼트 사용시 파라미터 순서는 무관
createPerson(weight = 43, height = 152, name = "Jake")
createPerson("Jake", weight = 43, height = 152)

fun createPerson(name: String, age: Int = 1, height: Int, weight: Int) {
    println("$name $age $height $weight")
}