package lesson_3

fun main() {
    val user = "Иван Иванов"
    val textGreetingDay = "Добрый день,"
    val textGreetingEvening = "Добрый вечер,"
    var textGreeting: String = "$textGreetingDay $user"
    println(textGreeting)

    textGreeting = "$textGreetingEvening $user"
    println(textGreeting)
}