fun nickName(name: String): String {
    if (name == "William") {
        return "Bill"
    }
    // 리턴타입이 String일 경우 (String은 null 불가) null로 리턴 불가
    // error: null can not be a value of a non-null type String
    return null
}
println("Nickname for William is ${nickName("William")}")
println("Nickname for Venkat is ${nickName("Venkat")}")
// 파라미터 타입이 String인 경우 함수를 호출할 때 null을 인자로 불가
// error: null can not be a value of a non-null type String
println("Nickname for null is ${nickName(null)}")