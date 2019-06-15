package guilherme.miguel.demo

/**
 * Converts a number in a list of its digits.
 * @return the list of digits
 */
fun Int.toIntList(): List<Int> = this.toString().map(Character::getNumericValue)

/**
 * Translates a text to Pig Latin.
 * @return the given text into Pig Latin
 */
fun String.toPigLatin(): String {

    val pigWord: (String) -> String = { "${it.takeLast(it.length - 1)}${it.first().toLowerCase()}ay" }

    return trim()
        .splitToSequence(' ')
        .filter { it.isNotEmpty() }
        .map(pigWord)
        .joinToString(" ")
        .capitalize()
}

fun main() {
    println(2324.toIntList())
    println("The quick brown fox".toPigLatin())
}