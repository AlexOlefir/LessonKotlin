package lesson_3

fun main() {
    val initialMove = "D2-D4;0"
    val initialMoveToArray = initialMove.toCharArray()
    val initialCell = initialMoveToArray[0].toString()+initialMoveToArray[1]
    val cellsEdit = initialMoveToArray[3].toString()+initialMoveToArray[4]
    val motionNumber = initialMoveToArray[6]
    println("Начальная позиция: $initialCell")
    println("Конечная позиция: $cellsEdit")
    println("Номер хода: $motionNumber")

}