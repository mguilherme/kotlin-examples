package guilherme.miguel.demo

import kotlin.math.pow

object Armstrong {

    fun isArmstrong(number: Int): Boolean {
        val string = number.toString()

        val sum = string
            .map { it.toString() }
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