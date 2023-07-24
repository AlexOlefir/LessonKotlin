package lesson_3

fun main() {
    var cells = "E" // Буква ячейки, на которой стояла фигура
    var numberCells = 2 //Номер ячейки, на которой стояла фигура
    var cellsEdit = "E" // Буква ячейки, на которую пошла фигура
    var numberCellsEdit = 4 //Номер ячейки, на которую пошла фигура
    var motionNumber = 1 //Номер хода
    var motion: String
    motion = cells + numberCells + cellsEdit + numberCellsEdit + motionNumber
    println(motion)

    cells = "D"
    numberCells = 2
    cellsEdit = "D"
    numberCellsEdit = 3
    motionNumber = motionNumber + 1
    motion = cells + numberCells + cellsEdit + numberCellsEdit + motionNumber
    println(motion)
}