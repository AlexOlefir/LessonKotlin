package lesson_1


fun main() {
    val seconds = 6480
    val remainderSeconds = seconds % 60
    val minute = seconds / 60
    val remainderMinute = minute % 60
    val hour = minute / 60
    var proverkaHour = "0"
    var proverkaMinute = "0"
    var proverkaSecond = "0"

    if (hour < 10) {
        proverkaHour += hour.toString()
    } else proverkaHour = hour.toString()

    if (remainderSeconds < 10) {
        proverkaSecond += remainderSeconds.toString()
    } else proverkaSecond = remainderSeconds.toString()

    if (remainderMinute < 10) {
        proverkaMinute += remainderMinute.toString()
    } else proverkaMinute = remainderMinute.toString()

    println("$proverkaHour:$proverkaMinute:$proverkaSecond")
}

