package org.example.lessons_2

fun main() {
    val trainDepartureHours = 9
    val trainDepartureMinutes = 39
    val trainTravelAllTime = 457
    val trainTravelHours = (trainTravelAllTime / 60)
    val trainTravelMinutes = (trainTravelAllTime % 60)
    val trainArrivalHours = trainTravelHours + trainDepartureHours
    val trainArrivalMinutes = (trainDepartureMinutes + trainTravelMinutes) % 60

    print(trainArrivalHours)
    print(":")
    print(trainArrivalMinutes)
}