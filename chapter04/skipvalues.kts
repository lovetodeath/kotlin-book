// 마지막값은 미포함 함수 until()
for (i in 1.until(5)) { print("$i, ") }
println("")
for (i in 1 until 5) { print("$i, ") }
println("")

// 일부 값 건너뛰기 step() 3개씩 뛰기
for (i in 1 until 10 step 3) { print("$i, ") }
println("")
for (i in 1.until(10).step(3)) { print("$i, ") }
println("")

for(i in 10.downTo(0).step(3)) { print("$i, ") }
println("")
for(i in 10 downTo 0 step 3) { print("$i, ") }
println("")

// 배수 반복 filter(). 3과 5의 배수만 반복
for (i in (1..9).filter { it % 3 == 0 || it % 5 == 0 }) {
    print("$i, ")
}
println("")