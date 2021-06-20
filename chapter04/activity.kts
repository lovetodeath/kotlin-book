// 여러 타입의 메시지를 받기 위해 Any타입 사용
// 가독성 측면에서 {} 보다는 짧은 단일표현식 사용 권장
// 로직이 복잡하다면 {} 보다는 메소드 분리
fun whatToDo(dayOfWeek: Any) = when (dayOfWeek) {
    "Saturday", "Sunday" -> "Relax"
    in listOf("Monday", "Tuesday", "Wednesday", "Thursday") -> "Work hard"
    in 2..4 -> "Work hard"
    "Friday" -> "Party"
    is String -> "What?"
    else -> "No Clue"
}
println(whatToDo("Sunday"))
println(whatToDo("Wednesday"))
println(whatToDo(3))
println(whatToDo("Friday"))
println(whatToDo("Munday"))
println(whatToDo(8))