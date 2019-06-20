package guilherme.miguel.demo

import guilherme.miguel.demo.FizzBuzz.fizzbuzz
import guilherme.miguel.demo.FizzBuzz.transform


object FizzBuzz {

    /**
     * Checks if the number is divisible by x.
     */
    private infix fun Int.divisibleBy(x: Int) = this % x == 0

    /**
     * Retrieves fizz for numbers that are multiples of 3,
     * buzz for numbers that are multiples of 5,
     * fizzbuzz for numbers that are multiples of 15
     *
     * @param n the number
     * @return fizz, buzz, fizzbuzz or the number itself
     */
    fun fizzbuzz(n: Int): String = when {
        n divisibleBy 15 -> "fizzbuzz"
        n divisibleBy 3 -> "fizz"
        n divisibleBy 5 -> "buzz"
        else -> n.toString()
    }

    /**
     * Applies a given operation into a range of values.
     *
     * @param range the range of values
     * @param operation the operation
     * @return a string with the multiples of 3, 5 or 15
     *         replaced with fizz, buzz, fizzbuzz or the number itself
     */
    fun transform(range: IntRange, operation: (Int) -> String): String {
        return range.joinToString(" ", transform = operation)
    }

}

fun main() {
    println(transform(1..20) { fizzbuzz(it) })
}