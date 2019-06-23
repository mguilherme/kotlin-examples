package guilherme.miguel.demo

import com.google.common.collect.HashBiMap
import guilherme.miguel.demo.Morse.morseToText
import guilherme.miguel.demo.Morse.textToMorse

object Morse {

    private fun <K, V> Map<K, V>.toBiMap(): HashBiMap<K, V> = HashBiMap.create(this)

    private val codes = mapOf(
        "a" to ".-",
        "b" to "-...",
        "c" to "-.-.",
        "d" to "-..",
        "e" to ".",
        "f" to "..-.",
        "g" to "--.",
        "h" to "....",
        "i" to "..",
        "j" to ".---",
        "k" to "-.-",
        "l" to ".-..",
        "m" to "--",
        "n" to "-.",
        "o" to "---",
        "p" to ".--.",
        "q" to "--.-",
        "r" to ".-.",
        "s" to "...",
        "t" to "-",
        "u" to "..-",
        "v" to "...-",
        "w" to ".--",
        "x" to "-..-",
        "y" to "-.--",
        "z" to "--..",
        "1" to ".----",
        "2" to "..---",
        "3" to "...--",
        "4" to "....-",
        "5" to ".....",
        "6" to "-....",
        "7" to "--...",
        "8" to "---..",
        "9" to "----.",
        "0" to "-----",
        " " to ""
    ).toBiMap()

    /**
     * Converts a given text to Morse code.
     */
    fun textToMorse(str: String) = str.map { it.toString().toLowerCase() }.map { codes[it] }.joinToString(" ")

    /**
     * Converts a given Morse code to text.
     */
    fun morseToText(str: String) = str.split(" ").map { codes.inverse()[it] }.joinToString("")

}

fun main() {
    println(textToMorse("sos sos"))
    println(morseToText("... --- ...  ... --- ..."))
}