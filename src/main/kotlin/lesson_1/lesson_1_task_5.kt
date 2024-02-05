package org.example.lesson_1

fun main() {
    val secondsOfFlight = 6480
    val secondsInMinute = 3600
    val oneHours = 60
    val hours = secondsOfFlight / secondsInMinute
    val remainderSeconds = (secondsOfFlight - hours * secondsInMinute)
    val minutes = (secondsOfFlight - hours * secondsInMinute) / oneHours
    val seconds = remainderSeconds - minutes * oneHours

    print("0$hours:$minutes:0$seconds")
}