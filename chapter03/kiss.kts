// kiss.kts
// 함수 정의는 fun. 항상 즐거우라고
// 단일표현함수 라면 함수 바디를 {} 대신 = 로 구분 가능, 단 단일표현함수에서 return은 불가능
fun greet() = "Hello"
// 타입지정시에는 앞에 :를 붙이고, 파라미터 리스트 뒤에 작성
fun greet2(): String = "Hello2"
println(greet())