package org.example.lessons_3

const val moveOneCellForward = 1
fun main() {
    var moveFromWhereLetter = "E"
    var moveFromWhereNumber = "2"
    var moveWhereLetter = "E"
    var moveWhereNumber = "4"
    var moveNumber = "1"

    println("$moveFromWhereLetter$moveFromWhereNumber - $moveWhereLetter$moveWhereNumber; $moveNumber")

    moveFromWhereLetter = "D"
    moveFromWhereNumber = "2"
    moveWhereLetter = "D"
    moveWhereNumber = "${moveFromWhereNumber.toInt() + moveOneCellForward}"
    moveNumber = "2"

    println("$moveFromWhereLetter$moveFromWhereNumber - $moveWhereLetter$moveWhereNumber; $moveNumber")
}