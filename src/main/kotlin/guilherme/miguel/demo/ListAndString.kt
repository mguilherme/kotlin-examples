package guilherme.miguel.demo

import guilherme.miguel.demo.ListAndString.createFrame
import guilherme.miguel.demo.ListAndString.toIntList

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

/**
 * Tests whether a string is a palindrome.
 */
fun String.isPalindrome() = this == this.reversed()

object ListAndString {

    /**
     * Converts a given number in a list of its digits.
     * @param n the number
     * @return the list of digits
     */
    fun toIntList(n: Int): List<Int> = n.toString().map { Character.getNumericValue(it) }

    /**
     * Retrieves a given list of words in a rectangular frame.
     */
    fun createFrame(words: List<String>): String {
        if (words.isEmpty()) return ""

        val maxWordLength = words.maxBy { it.length }.orEmpty().length
        val verticalLine = "*".repeat(maxWordLength + 4)

        val prefix: (String) -> String = { "* $it" }
        val suffix: (String) -> String = {
            val word = it.replace(Regex("""[$* ]"""), "")
            val rightSpaces = (maxWordLength - word.length) + 1
            "$it${" ".repeat(rightSpaces)}*\n"
        }

        return "$verticalLine\n${words.map(prefix).map(suffix).joinToString("")}$verticalLine\n".trim()
    }
}

fun main() {
    println(toIntList(2324))
    println("The quick brown fox".toPigLatin())
    println("Hetay uickqay rownbay oxfay".toEnglish())
    println("wow".isPalindrome())
    println(createFrame(listOf("Hello", "World", "in", "a", "frame")))
}