package guilherme.miguel.demo

/**
 * Converts a number in a list of its digits.
 * @return the list of digits
 */
fun Int.toIntList(): List<Int> = this.toString().map(Character::getNumericValue)

fun main() {
    println(2324.toIntList())
}