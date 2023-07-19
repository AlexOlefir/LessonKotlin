package lesson_2

fun main() {
    val student = listOf<Float>(3f, 4f, 3f, 5f)
    var sum = 0f
    for (n in 0..student.size - 1) {
        sum += student[n]
    }
    var itogSum = sum / student.size.toInt()
    println("Средний балл по школе:$itogSum")
}