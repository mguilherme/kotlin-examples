package guilherme.miguel.demo

object Fibonacci {

    /**
     * Calculate Fibonacci number.
     *
     * @param n number to calculate Fibonacci.
     * @return the Fibonacci number
     */
    fun fibonacci(n: Int): Int = when (n) {
        0, 1 -> n
        else -> fibonacci(n - 1) + fibonacci(n - 2)
    }


    /**
     * Retrieves a string with numbers for a given range and function.
     *
     * @param range     the given range
     * @param operation the function
     * @return A comma separated String
     */
    fun range(range: IntRange, operation: (Int) -> Int) = range.map(operation).map(Int::toString).joinToString()

}

fun main() {
    println(Fibonacci.fibonacci(6))
    println(Fibonacci.range(0..10, Fibonacci::fibonacci))
}