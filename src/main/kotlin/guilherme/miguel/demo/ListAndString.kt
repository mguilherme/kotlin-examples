package guilherme.miguel.demo

import guilherme.miguel.demo.ListAndString.createFrame
import guilherme.miguel.demo.ListAndString.createIntList

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
    fun createIntList(n: Int): List<Int> = n.toString().map { Character.getNumericValue(it) }

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
    println(createIntList(2324))
    println("wow".isPalindrome())
    println(createFrame(listOf("Hello", "World", "in", "a", "frame")))
}