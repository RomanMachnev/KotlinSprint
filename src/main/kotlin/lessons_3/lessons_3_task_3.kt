package org.example.lessons_3

fun main() {
    val mainNumber = "9"

    println(
        """
        $mainNumber x 1 = ${mainNumber.toInt() * 1}
        $mainNumber x 2 = ${mainNumber.toInt() * 2}
        $mainNumber x 3 = ${mainNumber.toInt() * 3}
        $mainNumber x 4 = ${mainNumber.toInt() * 4}
        $mainNumber x 5 = ${mainNumber.toInt() * 5}
        $mainNumber x 6 = ${mainNumber.toInt() * 6}
        $mainNumber x 7 = ${mainNumber.toInt() * 7}
        $mainNumber x 8 = ${mainNumber.toInt() * 8}
        $mainNumber x 9 = ${mainNumber.toInt() * 9}
    """.trimIndent()
    )
}