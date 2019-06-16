package guilherme.miguel.demo

/**
 * Converts a number in a list of its digits.
 * @return the list of digits
 */
fun Int.toIntList(): List<Int> = toString().map(Character::getNumericValue)

/**
 * Translates a text to Pig Latin.
 * @return the given text translated to Pig Latin
 */
fun String.toPigLatin(): String {
    val pigLatinWord: (String) -> String = { "${it.takeLast(it.length - 1)}${it.first()}ay" }
    return this convertTo pigLatinWord
}

/**
 * Translates a text from Pig Latin to English.
 * @return the given text translated to English
 */
fun String.toEnglish(): String {
    val englishWord: (String) -> String = { "${it[it.length - 3]}${it.dropLast(3)}" }
    return this convertTo englishWord
}

/**
 * Applies a given transformation to a given sentence.
 * @param converter the given converter
 */
private infix fun String.convertTo(converter: (String) -> String): String {
    return trim()
        .toLowerCase()
        .splitToSequence(' ')
        .filter { it.isNotEmpty() }
        .map(converter)
        .joinToString(" ")
        .capitalize()
}

fun main() {
    println(2324.toIntList())
    println("The quick brown fox".toPigLatin())
    println("Hetay uickqay rownbay oxfay".toEnglish())
}