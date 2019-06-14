package guilherme.miguel.demo

infix fun Int.divisibleBy(x: Int) = this % x == 0

object FizzBuzz {

    /**
     * Retrieves fizz for numbers that are multiples of 3,
     * buzz for numbers that are multiples of 5,
     * fizzbuzz for numbers that are multiples of 15
     *
     * @param n the number
     * @return fizz, buzz, fizzbuzz or the number itself
     */
    fun number(n: Int): String = when (true) {
        n divisibleBy 15 -> "fizzbuzz"
        n divisibleBy 3 -> "fizz"
        n divisibleBy 5 -> "buzz"
        else -> n.toString()
    }

    /**
     * Parse a range of numbers
     *
     * @param range the range
     * @return a string with the multiples of 3, 5 or 15
     *         replaced with fizz, buzz, fizzbuzz or the number itself
     */
    fun range(range: IntRange, operation: (Int) -> String): String {
        return range.joinToString(" ", transform = operation)
    }

}

fun main() {
    println(FizzBuzz.range(1..20) { FizzBuzz.number(it) })
}