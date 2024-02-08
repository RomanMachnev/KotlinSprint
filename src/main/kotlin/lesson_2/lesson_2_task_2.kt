package org.example.lesson_2

fun main() {
    val numberOfPermanentEmployees = 50
    val salaryOfOneEmployee = 30000
    val trainees = 30
    val salaryOneTrainees = 20000
    val totalNumberOfEmployees = numberOfPermanentEmployees + trainees
    val expensesOfPermanentEmployees = numberOfPermanentEmployees * salaryOfOneEmployee
    val expensesOfAllEmployees = numberOfPermanentEmployees * salaryOfOneEmployee + trainees * salaryOneTrainees
    val middleSalaryOneEmployee =
        (numberOfPermanentEmployees * salaryOfOneEmployee + trainees * salaryOneTrainees) / totalNumberOfEmployees

    println(expensesOfPermanentEmployees)
    println(expensesOfAllEmployees)
    println(middleSalaryOneEmployee)
}