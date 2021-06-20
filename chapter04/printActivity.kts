fun printWhatTodo(dayOfWeek: Any) {
    when (dayOfWeek) {
        "Saturday", "Sunday" -> println("Relax")
        in listOf("Monday", "Tusesday", "Wednesday", "Thursday") -> println("Work hard")
        in 2..4 -> println("Work hard")
        "Friday" -> println("Party")
        is String -> println("What?")
    }
}
printWhatTodo("Sunday")
printWhatTodo("Wednesday")
printWhatTodo(3)
printWhatTodo("Friday")
printWhatTodo("Munday")
printWhatTodo(8)