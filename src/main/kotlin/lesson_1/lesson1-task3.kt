package lesson_1

fun main() {
    // Изменено форматирование кода, добавлен вывод на печать
    // Переменная года полета Юрия Гагарина
    val year: String = "1961"
    // Переменная час взлета
    var hour: String = "09"
    // Переменная минута взлета
    var minute: String = "07"

    println("Год полета $year")
    println("Час взлета $hour")
    println("Минута взлета $minute")

    // меняем значения переменных
    hour = "10"
    minute = "55"

    // Вывод на печать
    print("Время посадки $hour:$minute")

}