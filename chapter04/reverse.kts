// 이 방식으로 for문은 불가
for (i in 5..1) { print("$i, ") }
println("")

// 후방향은 downTo 메소드를 사용
for (i in 5.downTo(1)) { print("$i, ") }
println("")
for (i in 5 downTo 1) { print("$i, ") }
println("")