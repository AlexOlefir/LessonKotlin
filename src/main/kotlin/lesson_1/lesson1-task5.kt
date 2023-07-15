package lesson_1

fun main(){

    val seconds : Short =  6480
    val remainderSeconds = seconds % 60
    val minute  = seconds / 60
    val remainderMinute = minute % 60
    val hour = minute / 60

    println("0$hour:$remainderMinute:0$remainderSeconds")

}