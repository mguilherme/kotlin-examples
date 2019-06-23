package guilherme.miguel.demo

/**
 * Retrieves the factorial of a positive number `n`
 */
fun Int.factorial() = (1..this).reduce { acc, n -> acc * n }


fun main() {
    println(10.factorial())
}

