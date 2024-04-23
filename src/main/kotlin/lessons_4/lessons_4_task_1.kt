package org.example.lessons_4

const val Total_Tables_In_The_Restaurant = 13
fun main() {

    val reservationTablesToday = 13
    val reservationTablesTomorrow = 9
    val availableTablesToday = reservationTablesToday < Total_Tables_In_The_Restaurant
    val availableTablesTomorrow = reservationTablesTomorrow < Total_Tables_In_The_Restaurant

    println("Доступность столиков на сегодня : $availableTablesToday")
    println("Доступность столиков на завтра : $availableTablesTomorrow")
}