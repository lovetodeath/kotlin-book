fun nickName(name: String?) = when (name) {
    "William" -> "Bill"
    null -> "Joker"
    // null 체크를 위에서 했기 때문에 null 오류 패스
    else -> name.reversed().toUpperCase()
}

println("Nickname for William is ${nickName("William")}")
println("Nickname for Venkat is ${nickName("Venkat")}")
println("Nickname for null is ${nickName(null)}")