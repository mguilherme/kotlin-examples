package guilherme.miguel.demo

import guilherme.miguel.demo.Morse.textToMorse

object Morse {

    /**
     * Converts to Morse code.
     */
    private fun Char.toMorse() = when (this.toLowerCase()) {
        'a' -> ".-"
        'b' -> "-..."
        'c' -> "-.-."
        'd' -> "-.."
        'e' -> "."
        'f' -> "..-."
        'g' -> "--."
        'h' -> "...."
        'i' -> ".."
        'j' -> ".---"
        'k' -> "-.-"
        'l' -> ".-.."
        'm' -> "--"
        'n' -> "-."
        'o' -> "---"
        'p' -> ".--."
        'q' -> "--.-"
        'r' -> ".-."
        's' -> "..."
        't' -> "-"
        'u' -> "..-"
        'v' -> "...-"
        'w' -> ".--"
        'x' -> "-..-"
        'y' -> "-.--"
        'z' -> "--.."
        '1' -> ".----"
        '2' -> "..---"
        '3' -> "...--"
        '4' -> "....-"
        '5' -> "....."
        '6' -> "-...."
        '7' -> "--..."
        '8' -> "---.."
        '9' -> "----."
        '0' -> "-----"
        ' ' -> "/"
        else -> throw IllegalArgumentException("Not all characters are valid")
    }

    /**
     * Converts a given text to Morse code.
     */
    fun textToMorse(str: String) = str.map { it.toMorse() }.joinToString("")

}

fun main() {
    println(textToMorse("sos sos"))
}