// null을 리턴하기 위해 String? 으로 리턴 타입 변경
fun nickName(name: String): String? {
    if (name == "William") {
        return "Bill"
    }
    return null
}
println("Nickname for William is ${nickName("William")}")
println("Nickname for Venkat is ${nickName("Venkat")}")
//println("Nickname for null is ${nickName(null)}")