package guilherme.miguel.demo

/**
 * Checks if the given number is prime
 * @param n the number to check
 * @return true if prime, false otherwise
 */
fun Int.isPrime() = this >= 2 && (2..(this / 2)).none { this % it == 0 }

fun main() {
    println(1.isPrime())
    println(2.isPrime())
}