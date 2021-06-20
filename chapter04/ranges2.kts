// 1에서 5까지 반복, 변수 i는 명시적으로 선언하지 않았어도 val
for (i in 1..5) { print("$i, ") }
println("")
for(ch in 'a'..'e') { print(ch) }
println("")

// CloseRange에는 iterator() 함수가 없어서 오류발생
// error: for-loop range must have an 'iterator()' method (ranges2.kts:6:13)
// for(word in "hell".."help") { print("$word, ") }