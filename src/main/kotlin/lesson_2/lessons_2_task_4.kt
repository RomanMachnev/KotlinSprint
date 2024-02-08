package org.example.lesson_2

fun main() {
    val percentBuffBonus = 20
    val onePercent = 100
    val crystalOre = 7f
    val ironOre = 11f
    val bonusCrystalOre = crystalOre / onePercent * percentBuffBonus
    val bonusIronOre = ironOre / onePercent * percentBuffBonus

    println(bonusCrystalOre.toInt())
    println(bonusIronOre.toInt())
}