package guilherme.miguel.demo

import io.kotlintest.data.forall
import io.kotlintest.matchers.collections.shouldContainExactly
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec
import io.kotlintest.tables.row

class ListAndStringTest : StringSpec({

    "should retrieve a list of its digits" {
        2342.toIntList() shouldContainExactly listOf(2, 3, 4, 2)
    }

    "should translate from English to Pig Latin" {
        "The quick brown fox".toPigLatin() shouldBe "Hetay uickqay rownbay oxfay"
    }

    "should translate from Pig Latin to English" {
        "Hetay uickqay rownbay oxfay".toEnglish() shouldBe "The quick brown fox"
    }

    "check if a string is palindrome" {
        forall(
            row("wow", true),
            row("radar", true),
            row("level", true),
            row("refer", true),
            row("dog", false),
            row("table", false)
        ) { str, result ->
            str.isPalindrome() shouldBe result
        }
    }

    "should retrieve a list of strings in a rectangular frame" {
        listOf("Hello", "World", "in", "a", "frame").toFrame() shouldBe """
                                                                        *********
                                                                        * Hello *
                                                                        * World *
                                                                        * in    *
                                                                        * a     *
                                                                        * frame *
                                                                        *********
                                                                        """.trimIndent()
    }

})