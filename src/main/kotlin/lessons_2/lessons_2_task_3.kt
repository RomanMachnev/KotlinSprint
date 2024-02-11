package org.example.lessons_2

fun main() {
    val trainDepartureHours = 9
    val trainDepartureMinutes = 39
    val trainTravelAllTime = 457
    val minutesInAnHour = 60
    val trainTravelHours = (trainTravelAllTime / minutesInAnHour)
    val trainTravelMinutes = (trainTravelAllTime % minutesInAnHour)
    val trainArrivalHours = trainTravelHours + trainDepartureHours
    val trainArrivalMinutes = (trainDepartureMinutes + trainTravelMinutes) % minutesInAnHour

    print(trainArrivalHours)
    print(":")
    print(trainArrivalMinutes)
}