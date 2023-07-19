package lesson_2

fun main() {
    val employeesSalary = 30000
    val numberOfEmployees = 50
    val internSalary = 20000
    val numberOfInterns = 30
    val employeesSalarySum = employeesSalary * numberOfEmployees
    val generalExpenses = employeesSalarySum + (internSalary * numberOfInterns)
    val averageSalary = generalExpenses / (numberOfInterns + numberOfEmployees)
    println("Расходы на выплату зарплаты постоянных сотрудников: $employeesSalarySum")
    println("Общие расходы по ЗП после прихода стажеров:$generalExpenses")
    println("Средняя ЗП одного сотрудника после устройства стажеров:$averageSalary")
}