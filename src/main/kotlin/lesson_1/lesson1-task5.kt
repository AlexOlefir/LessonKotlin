package lesson_1


fun main() {
    val seconds = 6480
    val rSeconds = seconds % 60
    val minute = seconds / 60
    val rMinute = minute % 60
    val hour = minute / 60
    println(String.format("%02d:%02d:%02d", hour, rMinute, rSeconds))
}

