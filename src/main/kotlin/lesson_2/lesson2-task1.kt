package lesson_2

fun main() {
    val student = listOf<Float>(3f, 4f, 3f, 5f)
    var sum = 0f
    var ItogSum: Float
    for (n in 0..student.size - 1) {
        sum += student[n]
    }
    ItogSum = sum / student.size.toInt()
    println("Средний балл по школе:$ItogSum")
}