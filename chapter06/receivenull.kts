// null parameter를 받기 위해 String? 으로 parameter 타입 변경
fun nickName(name: String?): String? {
    if (name == "William") {
        return "Bill"
    }
    return name?.reversed()?.toUpperCase()
}
println("Nickname for William is ${nickName("William")}")
println("Nickname for Venkat is ${nickName("Venkat")}")
println("Nickname for null is ${nickName(null)}")