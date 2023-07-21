package lesson_2

fun main() {
    val crystalOre = 7.0
    val ironOre = 11.0
    val baff = 20
    val crystalOrebaff = ((crystalOre / 100) * baff).toInt()
    val ironOrebaff = ((ironOre / 100) * baff).toInt()

    println("Количество бонусной кристаллической руды: $crystalOrebaff")
    println("Количество бонусной железной руды: $ironOrebaff")
}