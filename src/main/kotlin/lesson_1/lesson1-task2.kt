package lesson_1

fun main(){
// Переменная количество заказов
    var numberOfPurchases : Int  = 10
    println("Количество Ваших заказов:$numberOfPurchases")

    //Переменная с текстом благодарности за покупку
    val thanksThePurchase  : String = "Благодарим за покупку в нашем онлайн магазине! Приходите к нам снова!"
    println("$thanksThePurchase")
    //Переменная количество работников магазина
    var numberOfEmployees : Int = 2000
    //println("Всего сотрудников компании: $numberOfEmployees")
    numberOfEmployees -= 1
    println("Всего сотрудников компании: $numberOfEmployees")
}