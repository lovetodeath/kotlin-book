// null parameter를 받기 위해 String? 으로 parameter 타입 변경
fun nickName(name: String?): String? {
    if (name == "William") {
        return "Bill"
    }
    // error: only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    // null 가능 참조가 메소드를 호출할 때는 세이프 콜 연산자 또는 null이 아님을 확인해 주는 연산자 프리픽스를 요구
    // name이 null일 수 있기 때문에 코틀린은 컴파일러에서 오류를 발생시킴
    //return name.reversed()
    // 그래서 아래와 같이 코딩을 해야 한다.
    if (name != null) {
        return name.reversed()
    }
    return null
}
println("Nickname for William is ${nickName("William")}")
println("Nickname for Venkat is ${nickName("Venkat")}")
println("Nickname for null is ${nickName(null)}")