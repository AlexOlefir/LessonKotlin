package lesson_1

import java.text.Format
import kotlin.time.Duration.Companion.hours


fun main() {
    val seconds = 6480
    val remainderSeconds = seconds % 60
    val minute = seconds / 60
    val remainderMinute = minute % 60
    val hour = minute / 60
    var proverkaHour: String = "0"
    if (hour < 10) {
        proverkaHour = proverkaHour + hour.toString()
    }
    var proverkaSecond: String = "0"
    if (remainderSeconds < 10) {
        proverkaSecond = proverkaSecond + remainderSeconds.toString()
    }
    println("$proverkaHour:$remainderMinute:$proverkaSecond")
}

