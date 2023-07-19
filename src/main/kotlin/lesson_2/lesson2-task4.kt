package lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val baff = 1.2
    val crystalOrebaff = crystalOre * baff
    val ironOrebaff = ironOre * baff
    val crystalbaff = (crystalOrebaff - crystalOre).toInt()
    val ironlbaff = (ironOrebaff - ironOre).toInt()
    println("Количество бонусной кристаллической руды: $crystalbaff")
    println("Количество бонусной железной руды: $ironlbaff")
}