package org.example.lessons_4

const val PERMITTED_WEIGHT_FROM = 35
const val PERMITTED_WEIGHT_UP_TO = 100
const val PERMITTED_VOLUME = 100
fun main() {
    var cargoWeight = 20
    var cargoVolume = 80

    println("Груз с весом $cargoWeight и объемом $cargoVolume соответствует категории Average: ${cargoWeight > PERMITTED_WEIGHT_FROM}")
    println("Груз с весом $cargoWeight и объемом $cargoVolume соответствует категории Average: ${cargoWeight <= PERMITTED_WEIGHT_UP_TO}")
    println("Груз с весом $cargoWeight и объемом $cargoVolume соответствует категории Average: ${cargoVolume < PERMITTED_VOLUME}")

    cargoWeight = 50
    cargoVolume = 100

    println("Груз с весом $cargoWeight и объемом $cargoVolume соответствует категории Average: ${cargoWeight > PERMITTED_WEIGHT_FROM}")
    println("Груз с весом $cargoWeight и объемом $cargoVolume соответствует категории Average: ${cargoWeight <= PERMITTED_WEIGHT_UP_TO}")
    println("Груз с весом $cargoWeight и объемом $cargoVolume соответствует категории Average: ${cargoVolume < PERMITTED_WEIGHT_FROM}")
}