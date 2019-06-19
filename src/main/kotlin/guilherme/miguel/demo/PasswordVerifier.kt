package guilherme.miguel.demo

import guilherme.miguel.demo.PasswordVerifier.verify

object PasswordVerifier {

    /**
     * Performs validations for a given string.
     *
     * @param str the string to be validated
     */
    fun verify(str: String?) = when {
        str == null -> throwException("password should not be null")
        str.length <= 8 -> throwException("password should be larger than 8 chars")
        str == str.toLowerCase() -> throwException("password should have one uppercase letter at least")
        str == str.toUpperCase() -> throwException("password should have one lowercase letter at least")
        str.none { it.isDigit() } -> throwException("password should have one number at least")
        else -> Unit
    }

    /**
     * Throws an IllegalArgumentException with a given message.
     *
     * @param msg the message
     * @return an IllegalArgumentException
     */
    private fun throwException(msg: String): Nothing = throw IllegalArgumentException(msg)

}

fun main() {
    verify("aaaaa5AAAAA")
}