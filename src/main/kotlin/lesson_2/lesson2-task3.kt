package lesson_2

fun main() {
    val departureHour = 9 //Час отправления
    val departureMinute = 39 //Минута отправления
    val travelTime = 457 //Время в пути в минутах
    val travelTimeHour = travelTime / 60 //Время в пути часов
    val travelTimeMinute = travelTime % 60 // Время в пути минут
    var arrivalHour = departureHour + travelTimeHour // Время прибытия час
    var arrivalMinute = departureMinute + travelTimeMinute //Время прибытия минута
    if (arrivalMinute >= 60) {
        arrivalHour += 1; arrivalMinute -= 60
    }
    println(String.format("Время прибытия поезда: %02d:%02d", arrivalHour, arrivalMinute))
}