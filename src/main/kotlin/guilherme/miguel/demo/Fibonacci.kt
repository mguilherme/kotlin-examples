package guilherme.miguel.demo

import guilherme.miguel.demo.Fibonacci.fibonacci
import guilherme.miguel.demo.Fibonacci.transform

//private fun Int.fibonacci(): Int = when (this) {
//    0, 1 -> this
//    else -> (this - 1).fibonacci() + (this - 2).fibonacci()
//}

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
     * Transforms a range of numbers for a given operation.
     *
     * @param range     the given range
     * @param operation the function
     * @return A comma separated String
     */
    fun transform(range: IntRange, operation: (Int) -> Int) = range.map(operation).joinToString { it.toString() }

}

fun main() {
    println(fibonacci(6))
    println(transform(0..10) { fibonacci(it) })
}