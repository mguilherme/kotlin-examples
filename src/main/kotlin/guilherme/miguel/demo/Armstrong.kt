package guilherme.miguel.demo

import kotlin.math.pow

/**
 * Check if an number is Armstrong.
 *
 * @return true if Armstrong, false otherwise
 */
fun Int.isArmstrong(): Boolean {
    val string = this.toString()

    val sum = string
        .map { Character.getNumericValue(it) }
        .map { it.toDouble() }
        .map { it.pow(string.length) }
        .sum()
        .toInt()

    return sum == this
}

fun main() {
    println(371.isArmstrong())
}