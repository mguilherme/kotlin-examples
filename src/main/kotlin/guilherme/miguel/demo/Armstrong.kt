package guilherme.miguel.demo

import kotlin.math.pow

object Armstrong {

    /**
     * Check if a number is Armstrong.
     *
     * @param number number number to check if Armstrong
     * @return true if Armstrong, false otherwise
     */
    fun isArmstrong(number: Int): Boolean {
        val string = number.toString()

        val sum = string
            .map(Character::getNumericValue)
            .map { it.toDouble() }
            .map { it.pow(string.length) }
            .sum()
            .toInt()

        return sum == number
    }

}

fun main() {
    println(Armstrong.isArmstrong(371))
}